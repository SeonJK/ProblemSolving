import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val cardNum = nextInt()
    val limit = nextInt()
    val list = mutableListOf<Int>()
    repeat(cardNum) {
        list.add(nextInt())
    }

    var max = 0
    for (i in 0 until list.size-2) {
        for (j in i+1 until list.size-1) {
            for (k in j+1 until list.size) {
                val sum = list[i] + list[j] + list[k]
                if ((max < sum) && (sum <= limit)) {
                    max = sum
                }
            }
        }
    }

    print(max)
}