package OOP

/**
 * Data class
 * Merupakan class yang secara otomatis akan membuatkan function equals, hashCode,toString dan copy dari semua properties yang terdapat di primary constructor yang dimiliki oleh data class
 * memiliki function copy yang berfungsi untuk mengcopy object yang sudah ada
 */

data class Product( val name:String, val price:Int, val category:String)

fun main() {
    val product : Product  = Product("laptop", 1000, "Elektronik")
    println(product) // OOP.Product@7cc355be -> Hasil jika tidak menggunakan data class

    val product2 = product.copy(name = "handpone")
    print(product2)
}