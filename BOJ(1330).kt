/* 두 수 비교하기 */

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val num1 = nextInt()
    val num2 = nextInt()

    print(
        if (num1 > num2) ">"
        else if (num1 < num2) "<"
        else "=="
    )
}