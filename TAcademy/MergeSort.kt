import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val count = 8
    val array = IntArray(count).apply {
        repeat(count) { index ->
            set(index, nextInt())
        }
    }
    mergeSort(array, 0, count-1)
}

fun mergeSort(array: IntArray, start: Int, end: Int) {
    if (start < end) {
        val mid = (start+end)/2
        mergeSort(array, start, mid)
        mergeSort(array, mid+1, end)
//        merge(array, start, mid, end)
        mergeWithNewList(array, start, mid, end)
    }
}

fun merge(array: IntArray, start: Int, mid: Int, end: Int) {
    var tmp: Int
    var i = start
    var j = mid+1

    while (i <= mid && j <= end) {
        if (array[i] > array[j]) {
            tmp = array[i]
            array[i] = array[j]
            array[j] = tmp
        }
        i++

        println("${array.contentToString()}, i=${i}, j=${j}")
    }
}

fun mergeWithNewList(array: IntArray, start: Int, mid: Int, end: Int) {
    // 임시 리스트 생성
    val newList = mutableListOf<Int>()
    // 임시 인덱스
    var idxA = start
    var idxB = mid+1

    // 첫번째 배열의 인덱스와 두번째 배열의 인덱스 내에서 반복
    while (idxA <= mid && idxB <= end) {
        if (array[idxA] <= array[idxB]) {
            // 첫번째 배열의 요소가 더 작으면 임시 리스트에 추가
            newList.add(array[idxA])
            idxA++
        } else {
            // 두번째 배열의 요소가 더 작으면 임시 리스트에 추가
            newList.add(array[idxB])
            idxB++
        }
    }

    // 첫번째 배열의 요소를 다 소진했을 경우
    if (idxA > mid) {
        // 두번째 배열의 남은 요소를 임시 리스트에 추가
        for (i in idxB .. end) {
            newList.add(array[i])
        }
    }

    // 두번째 배열의 요소를 다 소진했을 경우
    if (idxB > end) {
        // 첫번째 배열의 남은 요소를 임시 리스트에 추가
        for (i in idxA .. mid) {
            newList.add(array[i])
        }
    }

    // 임시 리스트를 원래 배열에 동기화
    for (elem in newList.indices) {
        array[start+elem] = newList[elem]
    }
    println("newList=$newList")
    println(array.contentToString())
}