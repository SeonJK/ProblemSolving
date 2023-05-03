package Programmers

fun main() {
    print(solution("BCBdbe", "B"))
}

fun solution(my_string: String, letter: String) = my_string.filter { it != letter[0] }
