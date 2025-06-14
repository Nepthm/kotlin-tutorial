package Collection

/*
 ? RANDOM ORDER
 * Mengacak isi element di collection

 ? OPERATION
 * shuffled() -> membuat collection baru dengan posisi element random

 */

fun main() {
    val numbers = (1..10).toList()
    println(numbers.shuffled())
    println(numbers.shuffled())
    println(numbers.shuffled())
}