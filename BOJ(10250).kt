import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    repeat(nextInt()) {
        val height = nextInt()
        val width = nextInt()
        val guestNum = nextInt()

        val result =
            if (guestNum % height == 0) {
                val roomNum = guestNum / height
                "%d%02d".format(height, roomNum)
            } else {
                val roomNum = guestNum / height + 1
                val floor = guestNum % height
                "%d%02d".format(floor, roomNum)
            }

        println(result)
    }
}