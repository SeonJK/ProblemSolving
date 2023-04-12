package Programmers

fun main() {
    solution(1,2,3,4)
}

fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
    var v1 = calculate(denom1, denom2)
    var v2 = v1 * (denom1/v1) * (denom2/v1)

    var numer = (numer1 * (v2/denom1) + numer2 *(v2/denom2))
    var v3 = calculate(numer, v2)
    if (v3 != -1) {
        v2 /= v3
        numer /= v3
    }
    var answer: IntArray = intArrayOf(numer, v2)
    return answer
}

fun calculate(num1: Int, num2: Int): Int {
    var result = -1
    var answer = if (num1 < num2) num1 else num2

    run breaking@ {
        (answer downTo 1).forEach {
            if (((num1 % it) == 0) && ((num2 % it) == 0)) {
                result = it
                return@breaking
            }
        }
    }
    return result
}