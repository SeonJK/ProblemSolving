import java.util.Scanner

fun main() = insertionSortASC()

fun insertionSortASC() = with(Scanner(System.`in`)) {
    val cnt = 6
    var tmp: Int
    val numList = mutableListOf<Int>().apply {
        repeat(cnt) {
            add(nextInt())
        }
    }

    // 정렬된 배열의 마지막 인덱스
    repeat(cnt-1) {
        for (i in it downTo 0) {
            if (numList[i] > numList[i+1]) {
                tmp = numList[i+1]
                numList[i+1] = numList[i]
                numList[i] = tmp
            }
        }
        println(numList)
    }
}

fun insertionSortDESC() = with(Scanner(System.`in`)) {
    val cnt = 6
    var tmp: Int
    val numList = mutableListOf<Int>().apply {
        repeat(cnt) {
            add(nextInt())
        }
    }

    // 정렬된 배열의 마지막 인덱스
    repeat(cnt-1) {
        for (i in it downTo 0) {
            if (numList[i] < numList[i+1]) {
                tmp = numList[i+1]
                numList[i+1] = numList[i]
                numList[i] = tmp
            }
        }
        println(numList)
    }
}