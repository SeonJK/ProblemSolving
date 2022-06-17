/* 음계 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    // 입력 저장
    val array = IntArray(8).apply {
        for (i in indices) {
            this[i] = nextInt()
        }
    }

    if (array[0] < array[1]) {
        // 올라가는 흐름이 맞는지 확인
        for (i in 0 until array.size-1) {
            if (array[i] < array[i+1]) {
                continue
            } else {
                // 아니면 끝냄
                print("mixed")
                return@with
            }
        }
        print("ascending")
    } else {
        // 내려가는 흐름이 맞는지 확인
        for (i in 0 until array.size-1) {
            if (array[i] > array[i+1]) {
                continue
            } else {
                // 아니면 끝냄
                print("mixed")
                return@with
            }
        }
        print("descending")
    }
}