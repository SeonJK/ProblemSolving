import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var input = readLine()
    while(input != "0") {
        println(if (input == input.reversed()) "yes" else "no")
        input = readLine()
    }
}