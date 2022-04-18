import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    print("${StringTokenizer(readLine(), " ").countTokens()}")
}