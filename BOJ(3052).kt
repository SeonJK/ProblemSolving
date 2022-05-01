/* 나머지 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    // 입력변수 저장
    val inputArray = IntArray(10).apply {
        repeat(size) {
            // 입력값의 42로 나눈 나머지 값 저장
            set(it, nextInt()%42)
        }
    }


    val count = BooleanArray(42).apply {
        // 첫번 째 숫자 카운트
        this[inputArray[0]] = true
        // 첫번 째 숫자와 다른 숫자 카운트
        for (i in inputArray.indices) {
            if (inputArray[i] != inputArray[0]) {
                this[inputArray[i]] = true
            }
        }
        // 카운트된 인덱스 합
    }.count{ it }

    print(count)
}