import jdk.internal.org.jline.utils.Colors.s

fun main() {

    // Последовательности sequence
    val x = sequenceOf("Danil","Kira","Kate")

    println(x.joinToString())


    // Фильтрация filterNotNull(), filterIsInstance(), filterIndexed()

    val y = x.filterIndexed{index, s ->  (index % 2 == 0) && (s.length == 3)}
}