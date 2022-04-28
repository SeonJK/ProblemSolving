import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var hour = nextInt()
    var minute = nextInt()


    if (minute < 45) {
        // 분이 45분보다 작으면
        // 시간은 하나 줄이고, 0일 경우 23으로 설정
        hour = if (hour == 0) 23 else hour - 1
        // 분 계산 공식
        minute = 60 - (45 - minute)
    } else {
        // 분이 45분보다 크면 그대로 분만 뺄셈
        minute -= 45
    }

    print("$hour $minute")
}