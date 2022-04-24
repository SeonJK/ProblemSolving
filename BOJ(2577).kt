/* 숫자의 개수 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val a = nextLong()
    val b = nextLong()
    val c = nextLong()

    var result = a * b * c
    // 0-9까지 수를 카운트할 배열
    val numArray = IntArray(10)

    // 곱한 수가 0 이하가 될 때까지 반복
    while (result > 0) {
        // 1의 자리수 변수에 저장
        val num = result % 10
        // 인덱스와 같으면 해당 배열원소 1 증가
        numArray.forEachIndexed { index, _ ->
            if (index.toLong() == num) {
            numArray[index]++
            }
        }
        // 1의 자리수 없애기
        result /= 10
    }
    // 출력
    numArray.forEach {
        println(it)
    }
}