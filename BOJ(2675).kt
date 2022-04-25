/* 문자열 반복 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 테스트 케이스 개수
    val count = readLine().toInt()

    // 개수만큼 반복
    repeat(count) {
        // 한줄에 문자열 반복횟수와 문자열을 분리
        val (repeatCount: String, str: String) = readLine()
            .split(" ")


        var result = ""
        for (char in str) {
            // 반복횟수만큼 새로운 문자열에 추가
            repeat(repeatCount.toInt()) {
                result += char
            }
        }
        println(result)
    }
}