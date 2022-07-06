package Programmers

import kotlin.math.ceil

fun main() {
    val progresses = intArrayOf(95, 90, 99, 99, 80, 99)
    val speeds = intArrayOf(1, 1, 1, 1, 1, 1)
    print(solution(progresses, speeds).contentToString())
}

fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    var answer = intArrayOf()

    val leftDays: MutableList<Int> = mutableListOf<Int>().apply {
        repeat(progresses.size) {
            this.add(ceil((100 - progresses[it]) / speeds[it].toDouble()).toInt())
        }
    }
    val queue = ArrayDeque(leftDays)

    while (queue.isNotEmpty()) {
        var count = 1
        for (i in 1 until queue.size) {
            if (queue.first() >= queue[i]) {
                count++
            } else {
                break
            }
        }
        answer = answer.plus(count)

        repeat(count) {
            queue.removeFirst()
        }
    }

    return answer
}