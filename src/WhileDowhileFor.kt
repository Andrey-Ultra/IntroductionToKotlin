fun main(){
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    i = 0
    do {
        println(i)
        i++
    } while (i < 5)


    // Пример с коллекцией
    val names = listOf("Alice", "Bob", "Charlie")
    for (name in names) {
        println(name) // Выведутся имена Alice, Bob, Charlie
    }

// Пример с диапазоном значений
    for (i in 1..5) {
        println(i) // Выведутся числа 1, 2, 3, 4, 5
    }


    for (i in 1..10 step 2) {
        println(i) // Выведутся числа 1, 3, 5, 7, 9
    }

    for (i in 5 downTo 1) {
        println(i) // Выведутся числа 5, 4, 3, 2, 1
    }

    for (i in 1 until 5) {
        println(i) // Выведутся числа 1, 2, 3, 4
    }

    for (i in 1..<5) {
        println(i) // Выведутся числа 1, 2, 3, 4
    }
}