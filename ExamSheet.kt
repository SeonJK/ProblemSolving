fun main() {
    val array = arrayOf("[403]James", "[404]Azad,Louis,Andy", "[101]Azad,Guard")
    val target: Int = -1
    solution(array, target)
}

fun solution(rooms: Array<String>, target: Int): Array<String> {
    var answer = arrayOf<String>()
    val positionArray = emptyArray<Any>()

    rooms.forEach {
        val stringList = it.split("[","]")
        val nameList = stringList[2].split(",")

        for (i in nameList.indices) {
            if (positionArray.contains(nameList[i])) {
                print(positionArray[positionArray.indexOf(nameList[i])])
            } else {
                positionArray[i] = arrayOf(nameList[i], mutableListOf(stringList[1]))
            }
        }
    }


    return answer
}