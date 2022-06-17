/* 직각삼각형 */

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var a = nextInt()
    var b = nextInt()
    var c = nextInt()

    while (a != 0) {
        if ((a.times(a) == (b.times(b) + c.times(c))) ||
            (b.times(b) == (a.times(a) + c.times(c))) ||
            (c.times(c) == (a.times(a) + b.times(b)))
        ) {
            println("right")
        } else {
            println("wrong")
        }

        a = nextInt()
        b = nextInt()
        c = nextInt()
    }
}