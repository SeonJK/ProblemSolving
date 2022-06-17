/* 기찍 N */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val input = nextInt()

    for (i in input downTo 1) {
        println(i)
    }
}