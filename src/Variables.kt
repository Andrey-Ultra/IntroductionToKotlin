//Основы
fun main(){
    // Создание переменной x и присвоение ей значения value,
    // где value это какое-либо значение: число, строка, или что-либо ещё
    var w = 10.2

    var y: Int = 5  // Создание переменной типа Int и присвоение ей значения 5

    var z = "Привет, мир!"  // Kotlin сам определит тип переменной z как String

    var userName: String = "JohnDoe"
    var userAge: Int = 30
    var isUserActive: Boolean = true
    var userPhoneNumber: String = "+1234567890"
    var numberOfStudents: Int = 50

    val PI = 3.14  // Создание константы PI и присвоение ей значения 3.14

    val GREETING = "Привет, мир!"  // Создание константы GREETING и присвоение ей значения "Привет, мир!"

    val name = "Alice"
    println(name)  // Выведет "Alice" в консоль и перейдет на новую строку

    val name1 = "Alice"
    print(name1)  // Выведет "Alice" в консоль
    print("!")   // Выведет "!" на той же строке, результат: "Alice!"


    // Выводим приглашение для ввода
    println("Введите что-нибудь: ")

    // Читаем ввод с консоли и записываем его в переменную
    val enteredString = readLine()

    // Выводим введенную строку обратно в консоль
    println(enteredString)
}

//Перевод в другой тип данных
fun main2() {
    // Выводим приглашение для ввода
    println("Введите целое число ")

    // Читаем ввод с консоли и переводим в число
    val enteredString = readLine()

    val enteredInt = enteredString!!.toInt() // Используем !! для проверки, что переменная не пустая
    val enteredByte = enteredString.toByte()
    val enteredShort = enteredString.toShort()
    val enteredLong = enteredString.toLong()

    // Выводим числа обратно в консоль
    println(enteredInt) // Введенное число (Int)
    println(enteredByte) // Введенное число (Byte)
    println(enteredShort) // Введенное число (Short)
    println(enteredLong) // Введенное число (Long)
}

//Дробные числа
fun main3(){
    var x: Double = 10.5  // Создание переменной x типа Double со значением 10.5
    val y: Float = 3.14f  // Создание переменной y типа Float со значением 3.14
    val z = 7.8  // Создание переменной z без явного указания типа данных, Kotlin сам определит тип как Double
    val a = 0.5f  // Создание переменной a с кратким указанем типа данных, Kotlin сам определит тип как Float

    val inputString = readLine()
    val floatValue: Float = inputString!!.toFloat() // Преобразуем строку в Float
    val doubleValue: Double = inputString!!.toDouble() // Преобразуем строку в Double
}

//Символы
fun main4(){
    var letter: Char = 'A'

    val inputString = readLine()
    val firstSymbol = inputString!![0]
// Говорим компилятору что в переменной inputString существует значение и получаем первый символ

    val code: Int = letter.code  // Получение символа 'A' как числа 65

    letter = 'A'
    val digit: Char = '7'
    val isLetter: Boolean = letter.isLetter()  // Результатом будет true
    val isDigit: Boolean = digit.isDigit()     // Результатом будет true

    letter = 'a'
    val upperCaseLetter: Char = letter.uppercaseChar()  // Результатом будет 'A'
    val lowerCaseLetter: Char = upperCaseLetter.lowercaseChar()  // Результатом будет 'a'
}

//Строки
fun main5(){
    val hello = "Привет, мир!"

    val emptyString = String() // Создание пустой строки

    val firstName = "John"
    val lastName = "Doe"
    var fullName = firstName + " " + lastName // Результат: "John Doe"

    fullName = firstName.plus(" ").plus(lastName) // Использование метода plus() дважды


    val name = "Alice"
    val greeting = "Привет, $name!" // Результат: "Привет, Alice!"
    val expression = "Вычисление выражений ${name[0]}${name.length} ${2 + 2}" // Результат: Вычисление выражений A5 4"

    val str = "Привет"
    val len = str.length // Результат: 6

    val str1 = "Hello"
    var firstChar = str1[0] // Результат: 'H'


    firstChar = str1.first() // Результат: 'H'

    val lastChar = str1.last() // Результат: 'o'

    val lastIndex = str1.lastIndex // Результат: 4 (индекс последнего символа в строке "Hello")

    val str2 = "Hello, World!"
    val substring1 = str2.substring(7) // "World!"
    val substring2 = str2.substring(0, 5) // "Hello"

    val containsHello = str2.contains("Hello") // true
    val containsFoo = str2.contains("Foo") // false
}

//Создание строки с помощью StringBuilder
fun main6(){
    var sb = StringBuilder("Hello")
    sb.append(" world") // Добавление к текущей строке
    println(sb.toString()) // Проверка промежуточного результата: "Hello world"

    sb.insert(5, ", Kotlin") // Вставка в позицию 5
    println(sb.toString()) // Проверка промежуточного результата: "Hello, Kotlin world"

    sb.delete(5, 13) // Удаление подстроки с 5 по 12 символ, чтобы оставалось "Hello world"
    println(sb.toString()) // Проверка промежуточного результата: "Hello world"

    sb.replace(0, 5, "Hi") // Замена первых 5 символов на "Hi"
    println(sb.toString()) // Ожидаемый результат: "Hi world"



    sb = StringBuilder() // Создание пустого объекта StringBuilder

    val sbWithInitialValue = StringBuilder("Hello") // Создание StringBuilder через начальное значение

    val sbAppend = StringBuilder().append("Hello") // Создание StringBuilder с использованием функции append



    sb = StringBuilder("Hello")
    sb.append(" world") // Добавление к текущей строке
    println(sb.toString()) // Проверка промежуточного результата: "Hello world"
    sb.insert(5, ", Kotlin") // Вставка в позицию 5
    println(sb.toString()) // Проверка промежуточного результата: "Hello, Kotlin world"
    sb.delete(5, 13) // Удаление подстроки с 5 по 12 символ, чтобы оставалось "Hello world"
    println(sb.toString()) // Проверка промежуточного результата: "Hello world"
    sb.replace(0, 5, "Hi") // Замена первых 5 символов на "Hi"
    println(sb.toString()) // Ожидаемый результат: "Hi world"


}

//null и nullable
fun main7(){
    //Присвоить значение
    var nullableVariable: Int? = null

    var str = "a"
    val length = str?.length //если str == null то прогорамма звершиться тут


    nullableVariable?.let {
        // Блок кода, который будет выполнен, если nullableVariable не является null
        println(it)
    }

    val length1 = str!!.length
    //!!: Оператор утверждения. Он используется для явного утверждения, что переменная не является null.
// Если переменная окажется null, будет сгенерировано исключение NullPointerException.

    val str2: String? = "Хелло" // Тут любая строка или null

    val strLength: Int? = str2 as? Int //Безопасное преобразование либо оно либо null

    val result = nullableVariable ?: 10

//    Если nullableVariable не равен null, result будет равен nullableVariable.
//    Если nullableVariable равен null, result будет равен defaultValue = 10.
}


