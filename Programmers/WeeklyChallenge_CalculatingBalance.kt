package Programmers

fun main() {
    solution(3, 20, 4)
}

fun solution(price: Int, money: Int, count: Int): Long{
    var total: Long = 0
    for (i in 1..count) {
            total += price * i
    }

    return if (total - money > 0) {
        (total - money).toLong()
    } else {
        0
    }
}
