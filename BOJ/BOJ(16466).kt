/* 콘서트 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    // 방법 1. 시간초과
//    val list = arrayListOf<Int>().apply {
//        repeat(nextInt()) {
//            this.add(nextInt())
//        }
//    }.sorted()
//
//    var num = 1
//    while (num <= list.size) {
//        if (!list.contains(num)) {
//            print(num)
//            return@with
//        }
//        num++
//    }
//    print(num)

    // 방법 2. 인덱스 원소만 비교
    val list = arrayListOf<Int>().apply {
        repeat(nextInt()) {
            this.add(nextInt())
        }
    }.sorted()

    for (i in list.indices) {
        if (list[i] != i+1) {
            print(i+1)
            return@with
        }
    }
    print(list.size+1)
}