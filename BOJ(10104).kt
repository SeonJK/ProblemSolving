/* Party Invitation */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val k = nextInt()   // 친구 수
    var m = nextInt()   // 라운드 수
    // 친구를 번호 매겨서 리스트에 저장
    val list = mutableListOf<Int>().apply {
        repeat(k) {
            this.add(it+1)
        }
    }

    // 라운드 진행
    while (m > 0) {
        var i = 1
        val r = nextInt()

        var size = list.size
        var idx = 0
        while (idx < size) {
            if (i % r == 0) {
                // r의 배수 번째 친구이면 제거
                list.removeAt(idx)
                size--
                idx--
            }
            i++
            idx++
        }
        m--
    }

    for (e in list) {
        println(e)
    }
}