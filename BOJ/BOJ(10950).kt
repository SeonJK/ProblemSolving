/* A+B - 3 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val case = nextInt()

    repeat(case) {
        println(nextInt()+nextInt())
    }
}