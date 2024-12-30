import java.lang.StringBuilder

fun main() {

    /*
    Создать класс Box(коробка), у которого есть свойства width, height, depth.
    Написать функцию вычисления объёма коробки в классе Box.
    В классе с функцией main создать экземпляр класса Box, в конструктор класса передать свойства, задать им значения,
    вызвать функцию вычисления объема и вывести его на экран.
    */
    val box = Box(5, 4, 8)
    println("Вычисление объема коробки ${box.width}*${box.height}*${box.depth} : ${box.volumeCalculations()}")
    println()

    minimumAndMaximumOfElementsOfGivenSet(5, 6, 7, 8, 9, 15, 25, 0, 34, 45)
    println()

    /*
    Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23. Вывести на экран элементы массива.
    */
    val array = arrayOf(3, 67, 1, 55, 65, 89, 23)
    println(array.contentDeepToString())
    println()

    val a = -100001
    descriptionOfNumber(a)
    println()

    /*
    Создайте класс Car.
    В классе есть конструктор с параметрами массы, скорости.
    В классе с функцией main создайте экземпляр этого класса и задайте там параметры в конструктор.
    Напишите функции движения и остановки автомобиля.
    */
    val car = Car(1500, 100)
    println(car)
    car.stop()
    car.traffic()

}

/*
Дан набор из N чисел. Найти минимальный и максимальный из элементов данного набора и вывести их.
*/
fun minimumAndMaximumOfElementsOfGivenSet(vararg set: Int) {
    println(set.toList())
    println("Минимальный из элементов данного набора: ${set.minOrNull()}")
    println("Максимальный из элементов данного набора: ${set.maxOrNull()}")
}

/*
Дано целое число.
Вывести его строку-описание вида «отрицательное четное число», «отрицательное нечетное число» «нулевое число»,
«положительное нечетное число», «положительное четное число». int a = 34 à «положительное четное число»
*/
fun descriptionOfNumber(a: Int) {
    val string = StringBuilder("int a=$a - ")
    when (a) {
        0 -> string.append("нулевое")
        in 1..Int.MAX_VALUE -> string.append("положительное")
        in Int.MIN_VALUE..-1 -> string.append("отрицательное")
    }
    if (a != 0) if (a % 2 == 0) string.append(" четное") else string.append(" нечетное")
    println(string.append(" число"))
}

/*
Примечания:
Для вывода значений на экран используйте функцию println().
*/