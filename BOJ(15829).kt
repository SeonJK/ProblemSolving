/* Hashing */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val length = readLine()!!.toInt()
    var cnt = 0
    var sum: Long = 0

    readLine()!!.forEach { char ->
        var temp: Long = (char.code - 96).toLong()
        for (i in 0 until cnt) {
            temp *= 31
            temp %= 1234567891
        }
        sum = (sum+temp) % 1234567891
        cnt++
    }

    print(sum)


    // (a*b)%N == { (a%N) * (b%N) } % N
//    val length = readLine()!!.toInt()
//    var go = 0
//    var expo = 1L
//    var sum = 0L
//
//    readLine()!!.forEach {
//        // 26보다 큰 소수를 제곱하는 수에 mod 1234567891
//        expo = if (go==0) 1L else (expo*31)%1234567891
//        // 항의 번호에 해당하는 만큼 특정한 숫자를 거듭제곱해서 곱해준 다음 더한 값에
//        // mod 1234567891
//        sum = (sum + (it.code - 96) * expo) % 1234567891
//
//        go++
//    }
//    print(sum%1234567891)
}