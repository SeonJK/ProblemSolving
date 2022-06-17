/* 구구단 */

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val dan = nextInt()

    for (i in 1 .. 9) {
        println("$dan * $i = ${dan*i}")
    }
}