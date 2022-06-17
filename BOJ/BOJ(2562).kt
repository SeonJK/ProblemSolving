/* 최댓값 */

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val numArray = IntArray(9)

    // 입력한 수를 배열 원소로 삽입
    numArray.forEachIndexed { index, _ ->
        numArray[index] = nextInt()
    }

    // 최댓값 찾기
    val maxNum = numArray.maxOrNull()
    // 최댓값의 인덱스 찾기
    val maxIndex = numArray.indexOf(maxNum!!)

    print("${maxNum}\n${maxIndex+1}")
}