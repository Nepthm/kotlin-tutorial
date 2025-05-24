package OOP

// * Merupakan blok kode yang akan di eksekusi ketika constructor dipanggil
class Cars(brand:String, year:Int = 2020){

    init{
        println("Kode ini akan di eksekusi ketika constructor dipanggil")
    }
    var brand:String = brand
    var year:Int = year;
}

fun main() {
    val c1 = Cars("BMW",2023)
    println(c1.brand)
    println(c1.year)
    c1.year = 2025
    println(c1.brand)
    println(c1.year)
}