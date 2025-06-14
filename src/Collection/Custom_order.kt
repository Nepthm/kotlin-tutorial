package Collection


/*
 ? CUSTOM ORDER
 * Selain menggunakan comparable bawaan kotlin, dapat juga membuat comparable sendiri
 * Hal ini cocok untuk mengurutkan data yang kita buat sendiri

 ? OPERATION
 * sortedBy(selector(T) -> R) -> Mengurutkan collection secara ascending menggunakan selector
 * sortedByDescending(Selector: (T) -> R) -> Mengurutkan collection secara descending menggunakan selector
 * sortedWith(Comparator<T>) -> Mengurutkan collection dengan comparator<T>
 */

private data class Fruit(val name: String, val qty: Int)

fun main() {
    val fruits = listOf(
        Fruit("Apple", 10),
        Fruit("Orange", 5)
    )

    println(fruits.sortedBy { it.qty })
    println(fruits.sortedByDescending { it.qty })
    println(fruits.sortedWith(compareBy { it.qty })) // * hasilnya sama dengna sortedBy
    println(fruits.sortedWith(compareByDescending { it.qty })) // * hasilnya sama dengan sortedByDescending


    println(fruits.sortedWith(comparator = { a, b ->
        b.qty.compareTo(
            a.qty
        )
    }))

}