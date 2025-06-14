package Collection

/*
 ? ORDERING
 * Kotlin mendukung operasi untuk mengurutkan collection

 ? OPERATION
 * sorted() -> mengurutkan collection secara ascending
 * sortedDescending() -> mengurutkan collection secara descending
 */

fun main() {
    val numbers = listOf(1,4,2,4,6,3,5)
    println(numbers.sorted())
    println(numbers.sortedDescending())
}