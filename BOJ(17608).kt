/* 막대기 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    // 입력 값을 리스트에 저장
    val list = arrayListOf<Int>().apply {
        repeat(nextInt()) {
            this.add(nextInt())
        }
    }

    var tmp = list.last()       // 오른쪽에서부터 높은 막대 변수 저장
    var count = 1               // 보이는 막대 갯수 변수
    // 오른쪽에서부터 반복문 실행
    for (i in list.size-1 downTo 0) {
        // tmp보다 높으면 막대가 보임
        if (tmp < list[i]) {
            count++             // 막대 갯수 증가
            tmp = list[i]       // 더 높은 막대를 저장
        }
    }
    print(count)
}