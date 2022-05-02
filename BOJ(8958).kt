/* OX퀴즈 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 테스트 케이스 갯수
    val count = readLine().toInt()

    repeat(count) {
        var score = 0
        var sum = 0
        val case = readLine()

        // 케이스 길이만큼 반복
        for (i in case.indices) {
            if (case[i] == 'O') {
                // 정답이면
                score++
                sum += score
            } else {
                // 오답이면
                score = 0
            }
        }
        println(sum)
    }
}