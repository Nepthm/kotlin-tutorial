package OOP

/**
 * Standarnya properties wajib di inisialisasi di awal saat deklarasi properties
 * Namun di Kotlin bisa menunda inisialisasi data pada properties
 * Dengan menggunakan keyword lateinit, kita bisa membuat properties tanpa harus langsung mengisi datanya
 * Keyword ini hanya bisa digunakan pada var
 */

class Television{
   // ! var brand:String -> Error karena harus di inisialisasi
    lateinit var brand:String
    fun initTelevision(brand:String){
        this.brand = brand
    }

}

fun main() {
    val television = Television()
//    ! println(television.brand) -> Error karena belum di inisialisasi
    television.initTelevision("Samsung")
    println(television.brand)
}