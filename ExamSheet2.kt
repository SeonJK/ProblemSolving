import kotlin.math.absoluteValue

fun main() {
    val input = "Q4OYPI"

    solution(input)
}

fun solution(line: String): IntArray {
    var answer: IntArray = intArrayOf()
    val list = mutableListOf<Int>()

    val keyboard = arrayOf(
        arrayOf('1','2','3','4','5','6','7','8','9','0'),
        arrayOf('Q','W','E','R','T','Y','U','I','O','P')
    )
    val left = arrayOf(1,0)
    val right = arrayOf(1,9)

    line.forEach {
        var target = emptyArray<Int>()
        if (it.code in 48..57) {
            target = arrayOf(0, keyboard[0].indexOf(it))
        } else {
            target = arrayOf(1, keyboard[1].indexOf(it))
        }

        val leftGap = arrayOf((left[0]-target[0]).absoluteValue, (left[1]-target[1]).absoluteValue)
        val rightGap = arrayOf((right[0]-target[0]).absoluteValue, (right[1]-target[1]).absoluteValue)

        if (leftGap[0]+leftGap[1] > rightGap[0]+rightGap[1]) {
            list.add(1)
            right[0] = target[0]
            right[1] = target[1]
        } else if (leftGap[0]+leftGap[1] < rightGap[0]+rightGap[1]) {
            list.add(0)
            left[0] = target[0]
            left[1] = target[1]
        } else {
            if (leftGap[0] > rightGap[1]) {
                list.add(1)
                right[0] = target[0]
                right[1] = target[1]
            } else if(leftGap[0] < rightGap[1]){
                list.add(0)
                left[0] = target[0]
                left[1] = target[1]
            } else {
                if (target[1] in 0 .. 4) {
                    list.add(0)
                    left[0] = target[0]
                    left[1] = target[1]
                } else {
                    list.add(1)
                    right[0] = target[0]
                    right[1] = target[1]
                }
            }
        }
    }

    answer = list.toIntArray()
    return answer
}