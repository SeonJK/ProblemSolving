/* 최대공약수와 최소공배수 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val num1 = nextInt()
    val num2 = nextInt()
    val temp: Int

    var n1 = num1
    var n2 = num2
    while (true) {
        var tmp: Int

        if (n1 > n2) {
            tmp = n1 % n2
            n1 = n2
        } else {
            tmp = n2 % n1
        }
        n2 = tmp

        if (n2 == 0) {
            println(n1)
            temp = n1
            break
        }
    }
    println(temp*(num1/temp)*(num2/temp))
}