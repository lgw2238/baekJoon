fun main() {
    val input = readln()
    val result = IntArray(26) { -1 }

    for (i in input.indices) {
        val index = input[i] - 'a' // a 기준으로 알파벳 찾기
        if (result[index] == -1) {
            result[index] = i
        }
    }

    result.forEach { print("$it ") }
}