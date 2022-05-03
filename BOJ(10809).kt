/* 알파벳 찾기 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 위치를 저장할 배열 -1로 초기화
    val posArray = IntArray(26){ -1 }
    // 위치 변수
    var count = 0

    // 입력값을 문자로 하나씩 쪼개서 수행
    readLine().split("").toString().forEach {
        // 소문자이면
        if ((97 <= it.code) and (it.code <= 122)) {
            // 해당 알파벳의 위치가 저장되어있지 않으면 저장
            if(posArray[it.code - 97] == -1) {
                posArray[it.code - 97] = count
            }
            // 반복할 때마다 위치 올려주기
            count++
        }
    }
    // 출력
    for (i in posArray) {
        print("$i ")
    }
}