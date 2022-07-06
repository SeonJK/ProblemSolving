/* 전화번호 목록 */

package Programmers

fun main() {
    val phoneBook = arrayListOf<String>("119", "97674223", "1195524421")
    print(solution(phoneBook))
}

fun solution(phoneBook: ArrayList<String>): Boolean {
    // 정렬하여 1중 루프로 해결하는 방법
//    phoneBook.sort()
//
//    for (i in phoneBook.indices) {
//        if (phoneBook[i+1].startsWith(phoneBook[i])) {
//            return false
//        }
//    }
//    return true

    // HashMap을 이용하여 해결하는 방법
    val hashMap = hashMapOf<String, Int>().apply {
        for (number in phoneBook) {
            this[number] = 1
        }
    }

    for (item in phoneBook) {
        var jubdoo = ""
        for (char in item) {
            if (hashMap.containsKey(jubdoo) && jubdoo != item) {
                return false
            }
        }
    }
    return true
}