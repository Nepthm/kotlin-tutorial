package Collection

/*
 ? SET SPECIFIC OPERATION
 * Merupakan operasi yang hanya ada pada set

 ? OPERATION
 * union(collection) -> Mengembalikan semua element dari kedua set
 * intersect(collection) -> Mengembalikan semua element uang terdapat di kedua set
 * substract(collection) -> Mengembalikan semua element yang tidak dimiliki oleh set
 */

fun main() {
    val numbers1 = (1..10).toSet();
    val numbers2 = (6..15).toSet();
    println(numbers1 union numbers2)

    println(numbers1 intersect numbers2)

    println(numbers1 subtract numbers2)
}