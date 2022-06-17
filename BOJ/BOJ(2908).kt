/* 상수 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var num1 = nextInt()
    var num2 = nextInt()
    val num1Array = IntArray(3)
    val num2Array = IntArray(3)

    // 더 큰값을 가리키는 포인터 역할
    var maxValue = intArrayOf()

    // 자리수 비교를 위해 배열에 자리수 별로 저장
    for (i in 2 downTo 0) {
        num1Array[i] = num1 % 10
        num2Array[i] = num2 % 10

        num1 /= 10
        num2 /= 10
    }

    // 자리수 비교
    for (i in 2 downTo 0) {
        if (num1Array[i] > num2Array[i]) {
            maxValue = num1Array
            break
        } else if (num1Array[i] < num2Array[i]) {
            maxValue = num2Array
            break
        } else {
            continue
        }
    }

    // 더 큰 값 출력
    for (i in 2 downTo 0) {
        print(maxValue[i])
    }
}