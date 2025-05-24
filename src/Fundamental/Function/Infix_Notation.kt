package Fundamental.Function

/*
 * Operasi yang biiasa dilakukan di operasi matematika
 * Dimana dia melakukan operasi terhadap dua data
 * Untuk menggunakan function infix notation, tidak wajib menggunakan tanda ( . )
 */

/*
 * Syarat
 * 1. Harus memiliki 1 parameter
 * 2. Harus sebagai function member atau function extention
 * 3. Parameter tidak boleh varargs dan tidak boleh memiliki default value
 */

infix fun String.to(type:String):String{
    if(type == "UP"){
        return this.uppercase();
    }else{
        return this.lowercase()
    }
}

fun main() {
 val result = "Neptune" to "UP"
    println(result)
}