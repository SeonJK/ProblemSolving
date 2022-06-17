/* 단어순서 뒤집기 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringList = arrayListOf<List<String>>().apply {
        repeat(readLine()!!.toInt()) {
            this.add(readLine().split(" "))
        }
    }

    var count = 1
    for (list in stringList) {
        print("Case #${count}: ")
        for (j in list.reversed()) {
            print("$j ")
        }
        println()
        count++
    }
}