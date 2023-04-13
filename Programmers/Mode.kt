package Programmers

fun main() {
    modeSolution(intArrayOf(1,2,3,3,3,4))
}
fun modeSolution(array: IntArray): Int {
    val list = array.groupBy { it }.entries.sortedByDescending { (key, value) -> value.size }
    return if (list.size > 1 && list[0].value.size == list[1].value.size) -1 else list[0].key
}
