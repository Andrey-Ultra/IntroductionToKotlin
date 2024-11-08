fun main(){
    var x = 2

    if (x > 5) {
        println("x больше 5") // Ничего не выведется
    }

    val num = 0
    if (num > 0) {
        println("Число положительное")
    } else if (num < 0) {
        println("Число отрицательное")
    } else {
        println("Число равно нулю")
    }

    var result = if (x == 1) "Единица" else "Не единица"


    x = 5
    when (x) {
        1 -> println("x равно 1")
        2 -> println("x равно 2")
        3 -> println("x равно 3")
        else -> println("x не равно ни одному из перечисленных значений")
    }

    val y = 10
    when (y) {
        in 1..5 -> println("y в диапазоне от 1 до 5")
        in 6..10 -> println("y в диапазоне от 6 до 10")
        else -> println("y не входит в заданные диапазоны")
    }

    val z = 15
    when {
        z < 10 -> println("z меньше 10")
        z in 10..20 -> println("z в диапазоне от 10 до 20")
        else -> println("z больше 20")
    }

    val age = 20
    result = when {
        age < 18 -> "Ребенок"
        age in 18..64 -> "Взрослый"
        else -> "Пожилой человек"
    }
    println(result)
}