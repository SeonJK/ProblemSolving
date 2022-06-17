/* 부녀회장이 될테야 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val caseCount = nextInt()

    repeat(caseCount) {
        val k = nextInt()
        val n = nextInt()

        println(recursive(k, n))
    }
}

fun recursive(floor: Int, roomNum: Int): Int {
    // 1호실일 때
    if(roomNum == 1) {
        return 1
    }
    // 0층일 때
    if (floor == 0) {
        return roomNum
    }

    // n층일 때
    var sum = 1
    for (i in 2 .. roomNum) {
        sum += recursive(floor-1, i)
    }
    return sum
}