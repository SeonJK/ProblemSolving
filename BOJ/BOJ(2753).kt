/* 윤년 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val input = nextInt()

    // 4의 배수이고
    if( input%4 == 0) {
        // 100의 배수가 아니거나 400의 배수일 경우
        if( (input%100 != 0) || (input%400) == 0) {
            print(1)
            return@with
        }
    }
    print(0)
}