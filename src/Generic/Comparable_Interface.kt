package Generic


/*
 ? COMPARABLE INTERFACE
 * Sebelumnya ( di OOP ) operator perbandingan == dan != akan memanggil metode equals sebagai implementasinya
 * Bagaimana dengan perbandingan > < <= >=
 * operator perbandingan tersebut bisa di lakukan jika object kita mewarisi interface generic comparable
 */
class Fruit( val name : String, val qty : Int) : Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
       return qty.compareTo(other.qty)
    }
}

fun main() {
    val fruit1 = Fruit("Apple",10)
    val fruit2 = Fruit("Apple",100)

    // ? mengacu ke function compareTo
    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
}