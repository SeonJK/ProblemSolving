/* 단어 정렬 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 내가 푼 코드 -> 시간초과
//    val count = readLine().toInt()
//    val set = mutableSetOf<String>().apply {
//        repeat(count) {
//            this.add(readLine())
//        }
//    }
//
//    repeat(count) {
//        if (set.isEmpty()){ return@with }
//        val sortedList = set.sorted()
//
//        val min = sortedList.minByOrNull { it.length }!!
//
//        println(min)
//        set.remove(min)
//    }

    // 다른 사람이 푼 코드
    val n = readLine().toInt()
    val set: MutableSet<String> = mutableSetOf()

    repeat(n) {
        set.add(readLine())
    }

    val list = set.sortedWith(Comparator<String> { a, b ->
        if (a.length > b.length) 1
        else if (a.length < b.length) -1
        else a.compareTo(b)
    })

    list.forEach { println(it) }
}