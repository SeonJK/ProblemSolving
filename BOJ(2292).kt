/* 벌집 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var input = nextInt() - 1

    var i = 1
    while (input > 0) {
        input -= (i*6)
        i++
    }
    print(i)
}