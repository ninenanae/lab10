 fun main() {

    //Массив
    fun array() {
        print("Введите натуральное число n: ")
        val n = readLine()?.toIntOrNull() ?: 0

        val numbers = if (n == 0) {
            emptyList()
        } else {
            (n downTo 1).toList()
        }
        println(numbers)
    }

//Пидамида
    fun pyramid() {
        print("Введите количество уровней пирамиды (n): ")
        val n = readLine()?.toIntOrNull() ?: 0

        if (n > 0) {
            for (i in 1..n) {
                val spaces = " ".repeat(n - i)
                val hashes = "#".repeat(2 * i - 1)
                println("$spaces$hashes$spaces")
            }
        } else {
            println("Пожалуйста, введите положительное целое число.")
        }
    }

//Шифр цезаря
    fun caesar() {
        print("Введите текст: ")
        val text = readLine() ?: ""

        print("Введите сдвиг (целое число): ")
        val shift = readLine()?.toIntOrNull() ?: 0

        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val shiftedAlphabet = alphabet.substring(shift) + alphabet.substring(0, shift)
        val result = StringBuilder()

        for (char in text) {
            val uppercaseChar = char.uppercaseChar()
            val index = alphabet.indexOf(uppercaseChar)
            if (index != -1) {
                result.append(shiftedAlphabet[index])
            } else {
                result.append(char)
            }
        }

        println("Зашифрованный текст: ${result.toString()}")
    }

//Физзл биззл
    fun fizzBuzz() {
        print("Введите натуральное число n: ")
        val n = readLine()?.toIntOrNull() ?: 0

        if (n > 0) {
            val result = mutableListOf<Any>()
            for (i in 1..n) {
                if (i % 15 == 0) {
                    result.add("ВизллБизлл")
                } else if (i % 3 == 0) {
                    result.add(" Физллл  ")
                } else if (i % 5 == 0) {
                    result.add(" Бизлллл ")
                } else {
                    result.add(i)
                }
            }
            println(result)
        } else {
            println("Пожалуйста, введите положительное целое число.")
        }
    }

    array()
    pyramid()
    caesar()
    fizzBuzz()

}
