/* 별 찍기 - 1 */

import java.util.*

fun main() = with(Scanner(System.`in`)){
    val level = nextInt()

    for (i in 1 .. level) {
        for (j in 0 until i) {
            print("*")
        }
        println()
    }
}