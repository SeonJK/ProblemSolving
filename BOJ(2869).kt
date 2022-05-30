/* 달팽이는 올라가고 싶다 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val v = nextInt()

    print(if ((v-b)%(a-b) == 0) (v-a)/(a-b)+1 else (v-a)/(a-b)+2 )
}