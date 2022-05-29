import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var input = nextInt()

    // 방법 1.
    var bag = input / 5
    while ((input - bag * 5) % 3 > 0 && bag >= 0) {
        --bag
    }
    print(if (bag < 0) -1 else (input - bag * 5) / 3 + bag)

    // 방법 2.
//    for (i in (input /5).downTo(0)) {
//        val bag = input - i * 5
//        if (bag % 3 != 0) {
//            continue
//        }
//        print(i + bag / 3)
//        return@with
//    }
//    print(-1)

    // 방법 3.
//    for (i in 0 until input) {
//        val bag = input - 3 * i
//        if (bag < 0) {
//            print(-1)
//            break
//        }
//        if (bag.rem(5) == 0) {
//            print(i + bag / 5)
//            break
//        }
//    }

    // 방법 4.
    var count = 0
    while(true) {
        if (input % 5 == 0) {
            print("${input / 5 + count}")
            break
        } else if (input <= 0) {
            print(-1)
            break
        }

        input -= 3
        count++
    }
}