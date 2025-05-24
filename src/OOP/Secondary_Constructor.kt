package OOP

/**
 * Merupakan constructor yang dapat dibuat setelah primary constructor
 * Namun  harus memanggil constructor primary
 * Bisa membuat langsung tanpa primary constructor
 */

class Person(var firstName: String, var middleName: String?, var lastName: String) {
    init {
        println("Dieksekusi pertamakali karena constructor dipanggil")
    }

    constructor(firstName: String, lastName: String) : this(firstName, null, lastName) {
        println("Secondary constructor 1")
        println("Berjalan ketika constructor utama sudah dijalanakan")
    }

    // * menggunakan constructor diatasnya
    constructor(firstName: String) : this(firstName, " ") {
        println("Secondary constructor 2")
        println("Berjalan ketika constructor secondary 1 sudah dijalankan")

    }
}

class Addres{
    constructor( street:String, city:String, country:String){
        var street = street
        var city = city
        var country = country
    }
    constructor( street:String, country:String) : this(street, " ", country){
    }
}

fun main() {
    val p1 = Person("John", "Doe", "Smith")
    val p2 = Person("Jane", "Smith")
    val p3 = Person("Alice")

    println("person 1 : ${p1.firstName} ${p1.middleName} ${p1.lastName}")
    println("person 2 : ${p2.firstName} ${p2.lastName} ")
}