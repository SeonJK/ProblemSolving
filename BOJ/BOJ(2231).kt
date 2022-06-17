/* 분해합 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
//    val n = nextInt()

    // 방법1.
//    if (!mySum(n)) {
//        println("0")
//    }

    // 방법2.
//    val array = IntArray(1000000) {0}
//
//    run loop@ {
//        repeat(array.size) {
//            if (mSum(it) == n) {
//                println(it)
//                return@loop
//            }
//        }
//    }

    // 방법3.
    val input = readLine()?.toInt()
    for (i in 1 .. input!!) {
        var temp = i
        i.toString().forEach {
            temp += it - '0'
        }
        if (input == temp) {
            println(i)
            return@with
        }
    }
    println(0)
}

// 방법 1의 함수
private fun mySum(x: Int): Boolean{
    for (i in 1 .. x) {
        val array = IntArray(7) {0}
        var z = i
        var j = 0

        while (z != 0) {
            array[j] = (z % 10)
            z /= 10
            j++
        }

        val sum = array.sum()
        if (i+sum == x) {
            println(i)
            return true
        }
    }
    return false
}

// 방법 2의 함수
private fun mSum(num: Int): Int {
    var n = num
    var result = num

    while (n > 0) {
        result += (n%10)
        n /= 10
    }

    return result
}