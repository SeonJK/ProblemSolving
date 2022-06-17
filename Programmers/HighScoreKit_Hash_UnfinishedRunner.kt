/* 완주하지 못한 선수 */

package Programmers

fun main() {
    val participant = arrayOf("leo", "kiki", "eden")
    val completion = arrayOf("eden", "kiki")

    print(solution(participant, completion))
}

fun solution(participant: Array<String>, completion: Array<String>): String {
    var answer = ""
    val p = participant.sorted()
    val c = completion.sorted()

    for (i in completion.indices) {
        if (p[i] != c[i]) {
            answer = p[i]
            break
        }

        if (answer.isEmpty()) {
            answer = p.last()
        }
    }

    return answer
}