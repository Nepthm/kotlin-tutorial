package Fundamental.Function

fun main() {
    // * High order function
    // * Adalah function yang menggunakan function lain sebagai parameter atau mengembalikan funciton
    // * berguna ketika ingin membuat function yang general dan inign mendapatkan input yang flexible berupa lambda, yang bisa di deklarasikan oleh si user ketika memanggil funciton tersebut

    fun hello(name:String, transformer:(String)->String):String{
        val nameTransform = transformer(name);
        return "Helo $nameTransform";
    }
    val lambdaUpper:(String) -> String = { value:String -> value.uppercase()}
    println(hello("Noval", lambdaUpper))
    // * bisa juga dengan
    println(hello("Noval",{value:String -> value.lowercase()}))

    // * Trailing lambda (Lebih di rekomendasikan karena mudah dibaca)
    // * Jika parameter terakhir dari function adalah lambda, maka dapat menggunakan trailing lambda
    val result = hello("Neptune") {value:String -> value.uppercase()}
}