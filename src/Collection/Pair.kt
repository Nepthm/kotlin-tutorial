package Collection

/*
 ? PAIR
 * Adalah representasi dari data yang berpasangan ( key & value )
 */

fun main(args: Array<String>) {
    val pair : Pair<String, String> = Pair("Algo","Nepts")
    println(pair.first)

    val pair2 : Pair<String, String> = "Hello" to "Halo"
    println(pair2.first)
    println(pair2.second)

}