package OOP

/*
 ? Lazy Properties
 * Merupakan standar library yang telah di sediakan agar properties baru diinisialisasi ketika properties itu di akses
 */
class Account{
    // * Delegasi properties dengan lazy
    val name:String by lazy {
        println("Name is called")
        "Noval" // * akan di inisialisasi ketika di panggil
    }
}

fun main() {
    val account = Account()
    println(account.name) // * Memanggil properties name
    println(account.name)
}