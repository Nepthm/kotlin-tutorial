package Collection

/*
 ? DESTRUCTURING DECLARATIONS MAP
 * Karena map menyimpan datanya dalam Entry <K,V> dimana entry memiliki function component1() untuk mendapatkan key dan component2() untuk mendapatkan value
 * Hal ihni memungkinkan kita untuk melakukan destructuring declaration di entry map

 */

fun main() {
    val map = mapOf("a" to " Noval", "b" to "Putra", "c" to "Asmara")
    for ((key, value) in map){
        println("$key : $value")
    }

    println("===============")
    map.forEach{(key, value)-> println("$key : $value")}
    println("===============")
    map.forEach{entry -> println("${entry.component1()} : ${entry.component2()}") }
}