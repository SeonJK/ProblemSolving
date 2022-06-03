import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {

    val input = nextInt()

    var num = 0
    var count = 0
    while (true) {
        if (num.toString().contains("666")) {
            count++
        }
        if (count == input) {
            print(num)
            break
        }
        num++
    }
}