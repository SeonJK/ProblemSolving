/* 줄 세우기 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val arrayList = arrayListOf<Int>().apply {
        repeat(nextInt()) { num ->
            this.add(this.size-nextInt(), num+1)
        }
    }

    for (e in arrayList) {
        print("$e ")
    }
}