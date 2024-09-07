fun main() {
    // Создать приложение, которое подсчитывает количество различных символов во введенной строке.
    // Символы в ответе расположить в алфавитном порядке.
    // Например, дана строка AASADDSS. На выходе получаем:
    // A - 3
    // D - 2
    // S - 3

    val inputVal = readln()
    val charCounter = mutableMapOf<Char, Int>()

    inputVal.forEach { char ->
        charCounter[char] = charCounter.getOrDefault(char, 0) + 1
    }

    val sortedMap = charCounter.toSortedMap()

    sortedMap.forEach { (char, count) ->
        println("$char - $count")
    }
}