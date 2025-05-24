package OOP

/*
* Inline class
* Terlalu banyak class akan memakan konsumsi memori yang lebih banyak ketika program berjalan
* Inline class adalah class yang hanya memiliki satu properti
 */
inline class Token (val value:String){
    fun toUpper():String{
        return value.uppercase()
    }
}

fun main() {
    val token = Token("ini token")
    println(token.value)
    println(token.toUpper())
}
