fun main() = heapSort()

fun heapSort() {
    val array = intArrayOf(-1,4,1,3,2,16,9,10,14,8,7)
    val results = mutableListOf<Int>()
    var heapSize = array.size-1

    // maxHeap 초기화
    // 자식 노드를 가진 노드들만 순회
    for (i in heapSize/2-1 downTo 1) {
        maxHeapify(array, heapSize, i)
    }

    // 하나씩 추출
    for (j in heapSize downTo 1) {
        results.add(array[1])
        array[1] = array[j]
        maxHeapify(array, --heapSize, 1)
    }

    print(results)
}

fun maxHeapify(array: IntArray, heapSize: Int, parent: Int) {
    println(array.contentToString())

    var maxIndex = parent
    var lChild = parent*2
    var rChild = parent*2 +1


    // 왼쪽 자식 노드와 비교
    if (lChild < heapSize && array[lChild] > array[maxIndex]) {
        maxIndex = lChild
    }
    // 오른쪽 자식 노드와 비교
    if (rChild < heapSize && array[rChild] > array[maxIndex]) {
        maxIndex = rChild
    }

    // 교환이 일어났으면 재귀수행
    if (maxIndex != parent) {
        val tmp = array[maxIndex]
        array[maxIndex] = array[parent]
        array[parent] = tmp

        maxHeapify(array, heapSize, maxIndex)
    }
}