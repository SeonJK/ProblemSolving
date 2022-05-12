/* A+B - 5 */

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    forEachLine {
        val array = it.split(" ").toList()
        if (array[0] == "0") {
            exitProcess(0)
        } else {
            println(array[0].toInt() + array[1].toInt())
        }
    }
}