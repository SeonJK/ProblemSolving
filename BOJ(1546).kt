/* 평균 */

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val subjectNum = nextInt()  // 과목 수 저장
    val list = mutableListOf<Double>()
    var sumAllGrade: Double = 0.0

    // 입력 받은 과목점수를 list에 저장
    for(i in 0 until subjectNum) {
        list.add(nextDouble())
    }
    // 점수의 최댓값
    val maxNum = list.maxOrNull()

    // 새로운 점수 산출
    for (i in 0 until list.size) {
        list[i] = list[i] / maxNum!! * 100
    }

    // 새로운 점수로 평균 구하기
    list.forEach {
        sumAllGrade += it
    }
    print(sumAllGrade / subjectNum)
}