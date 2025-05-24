package Fundamental.Function

/*
 * Kemampuan untuk menambahkan function pada tipe data yang sudah ada
 * Semakin banyak menggunakan extension function, maka program akan sulit dibaca
 * Untuk mengakses datanya gunakan this
 */

fun String.hello() : String{
    return "Hello $this"// * -> Mengambil data dari varibel
}
fun main() {
    val name = "Neptss"
    val hello:String = name.hello()
    println(hello)
}