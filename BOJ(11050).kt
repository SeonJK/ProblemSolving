/* 이항 계수 1 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val r = nextInt()

    print(factorial(n) / (factorial(r) * factorial(n-r)))
}

fun factorial(x: Int): Int {
    if (x <= 1) {
        return 1
    }
    return x * factorial(x-1)
}