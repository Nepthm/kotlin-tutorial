package Generic


/*
 ? GENERIC CONSTRAINT
 * Membatasi tipe data yang akna di gunakan pada generic type
 * Secara otomatis, type data yang bisa digunakan adalah type yang sudah disebutan atau class turunannya

 ? WHERE KEYWORD
 * Secara default hanya satu tipe data yang bisa digunakan utuk membatasi generic parameter type
 * Namun dengan where kita bisa menggunakan lebih dari 1
 */

interface CanSayHello{
    fun sayHello(name:String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello{
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

// * Generic Type hanya akan menerima type data dari class Employee atau class turunannya
//class Company<T : Employee>(val employee: T)

// ? WHERE
class Company<T>(val employee: T) where T :Employee, T : CanSayHello


fun main() {
//    val data1 = Company(Employee()) -> Error karena tidak memuat CanSayHello
//    val data2 = Company(Manager()) -> Error karena tidak memuat CanSayHello
    val data4 = Company(VicePresident())
//    ! val data3 = Company("String") -> Error karena hanya di perbolehkan class Employee atau turunan dari class tersebut
}