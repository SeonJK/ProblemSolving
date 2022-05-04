import java.util.Scanner

fun main() = selectionSort()

fun selectionSort() = with(Scanner(System.`in`)){
    val cnt = 5
    var tmp: Int
    // list 입력 값으로 초기화
    val list = mutableListOf<Int>().apply {
        repeat(cnt) {
            add(nextInt())
        }
    }

    // n-1번 이동 수행
    repeat(cnt-1) {
        var minIndex: Int = it
        // 위치 다음 인덱스부터 최소값 비교
        for (i in it+1 until cnt) {
            minIndex = if (list[minIndex] > list[i]) i else minIndex
        }

        // SWAP 실행
        tmp = list[minIndex]
        list[minIndex] = list[it]
        list[it] = tmp
        // 정렬과정 출력
        println(list)
    }
}