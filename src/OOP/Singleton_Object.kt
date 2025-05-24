package OOP
/*
* Merupakan object yang hanya di buat satu kali
* Singleton object mirip dengna clas, bisa extends class ataupun interface
* Tidak memiliki constructor
* Biasa digunakan untuk helper class atau utility class
? Singleton object bisa dibuat di dalam sebuah class ( inner class )
* Namun tidak bisa mengakses properties atau function yang ada di outer class
*/

object Utilities{
    val name = "utilities" // ? Saat data ini berubah, maka semua object yang menggunakannya maka akna berubah
    fun toUpper(value:String): String{
        return value.uppercase()
    }
}

class Application(val name:String){
    object Helper{
        fun showName(name:String) : String{
            return name.uppercase()
        }
    }
}

fun main(args: Array<String>) {
    println(Utilities.name)
    println(Utilities.toUpper("Neptune"))
    println(Application.Helper.showName("Noval"))
}