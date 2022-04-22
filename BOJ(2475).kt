/* 검증수 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val numList = mutableListOf<Int>()

    // 리스트 생성
    for (i in 0 until 5) {
        numList.add(nextInt())
    }

    // 각 원소 제곱
    numList.forEachIndexed { index, e ->
        numList[index] = e * e
    }

    // 검증 수 계산
    print(numList.sum() % 10)
}