import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val count = nextInt()
    val inputArray = IntArray(count) { _ -> nextInt()}

    print("${inputArray.minOrNull()} ${inputArray.maxOrNull()}")
}