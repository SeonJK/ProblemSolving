import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val count = readLine().toInt()
    val set = mutableSetOf<String>().apply {
        repeat(count) {
            this.add(readLine())
        }
    }

    repeat(count) {
        if (set.isEmpty()){ return@with }
        val sortedList = set.sorted()

        val min = sortedList.minByOrNull { it.length }!!

        println(min)
        set.remove(min)
    }
}