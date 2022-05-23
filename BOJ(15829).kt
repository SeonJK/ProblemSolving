/* Hashing */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    // 시그마를 다 하고 mod 연산을 하지 않고
    // 각각에 mod 연산을 해서 문제 해결

    // 방법 1.
//    val length = readLine()!!.toInt()
//    var cnt = 0
//    var sum = 0L
//
//    readLine()!!.forEach { char ->
//        var temp: Long = (char.code - 96).toLong()
//        // 특정 소수 거듭제곱 부분
//        for (i in 0 until cnt) {
//            temp *= 31
//            temp %= 1234567891
//        }
//        // 시그마 부분
//        sum = (sum+temp) % 1234567891
//        cnt++
//    }
//
//    print(sum)


    // 방법 2.
    val length = readLine()!!.toInt()
    var go = 0
    var expo = 1L
    var sum = 0L

    readLine()!!.forEach {
        // 특정 소수 제곱하는 부분
        expo = if (go==0) 1L else (expo*31)%1234567891
        // 시그마 부분
        sum = (sum + (it.code - 96) * expo) % 1234567891

        go++
    }
    print(sum)
}