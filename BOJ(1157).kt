/* 단어 공부 */

fun main() {
    val map = mutableMapOf<Char, Int>().apply {
        readLine()!!.forEach {
            val key = it.uppercaseChar()
            this[key] = this.getOrDefault(key, 0) + 1
        }
    }
    val keys = map.filter { it.value == map.values.maxOrNull() }.keys

    print(
        if (keys.size > 1) "?"
        else keys.first()
    )
}