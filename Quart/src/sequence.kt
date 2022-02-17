fun main() {

    // Последовательности sequence
    val people = sequenceOf("Danil","Kira","Kate")

    println(people.joinToString())


    // Фильтрация filterNotNull(), filterIsInstance(), filterIndexed()

    val y = people.filterIndexed{index, s ->  (index % 2 == 0) && (s.length == 4)}

    println(y)

    val filtered = people.filterNotNull()

    val employees = people.filterIsInstance<String>();

    println(employees)

    println(filtered)


}