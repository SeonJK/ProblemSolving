/* X보다 작은 수 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val arrayCount = nextInt()
    val x = nextInt()
    val array = IntArray(arrayCount) { nextInt() }
        .filter { it < x }
        .forEach { print("$it ") }
}