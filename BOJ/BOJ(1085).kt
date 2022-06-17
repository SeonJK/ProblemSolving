/* 직사각형에서 탈출 */

import java.lang.Integer.min
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()
    val w = nextInt()
    val h = nextInt()

    val distanceX = min(x-0, w-x)
    val distanceY = min(y-0, h-y)

    print(min(distanceX, distanceY))
}