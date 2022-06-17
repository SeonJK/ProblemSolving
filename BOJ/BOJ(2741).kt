/* N 찍기 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val input = nextInt()

    for (i in 1 .. input) {
        println(i)
    }
}