/* 별 찍기 - 2 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val level = nextInt()

    for (i in level downTo 1) {
        for (j in 1 until i) {
            print(" ")
        }
        for (j in 0 .. level-i) {
            print("*")
        }
        println()
    }
}