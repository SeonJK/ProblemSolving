package Programmers

import java.util.*

fun main() {
    val priorities = intArrayOf(1,1,9,1,1,1)
    val location = 0
    println(solution(priorities, location))
}

fun solution(priorities: IntArray, location: Int): Int {
    var answer = 0
    val queue = ArrayDeque(priorities.toList())
    var changedLocation = location

    while (queue.isNotEmpty()) {
        // 큐에 최댓값을 첫번 쨰로 만들기
        while (queue.first() != queue.maxOrNull()!!) {
            queue.addLast(queue.first())
            queue.removeFirst()
            changedLocation--
        }

        // 현재 큐의 위치로 변경
        changedLocation =
            if (changedLocation < 0) {
                queue.size + changedLocation
            } else {
                changedLocation
            }

        // 내가 원하는 값이 첫번 째 값이면
        if (changedLocation == 0 && queue.first() == queue.maxOrNull()!!) {
            return answer
        } else {
            // 아니면
            answer++
            queue.removeFirst()
            changedLocation--
        }

        // 초기 배열 최대 사이즈에 넘었을 때
        if (answer == priorities.size) {
            return answer
        }
    }
    return answer
}
