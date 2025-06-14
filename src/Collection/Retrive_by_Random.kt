package Collection

/*
 ? RETRIVE BY RANDOM

 ? RETRIVE SINGLE ELEMENT BY RANDOM
 * Mengambil element secara random dalam collection

 ? OPERATION
 * random() -> mengambil element secara random

 */

fun main() {
    val range = (1..100).toList()
    println(range.random())
    println(range.random())
    println(range.random())
    println(range.random())
}