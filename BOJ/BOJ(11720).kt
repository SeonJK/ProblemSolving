/* 숫자의 합 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 첫번 째 줄 입력 값
    val count = readLine().toString()
    // 두번 째 줄 입력 값을 숫자 하나씩 나눠서 리스트로 초기화
    var numList = readLine().split("").toList()
    var sum: Long = 0

    // 0번 인덱스와 마지막 인덱스는 빈 공간이 차지하기 때문에
    // 1번 인덱스부터 숫자로 바꿔 더하기
    for (i in 1 .. count.toInt()) {
        sum += numList[i].toLong()
    }
    print(sum)
}