package OOP

// * toString()
// * Merupakan function yang digunakan untuk memberitahu representasi String dari object
// * Dapat di Override

// * equals()
// * berfungsi untuk membandingkan dua object

// * hashCode function
// * merupakan function yang digunakan sebagai representasi angka unit untuk objek yang kita buat
// * Sering digunakan untuk manajemen data yang unique dengan membandingkan hashCode yang dihasilkan

class Users(var username:String, var password:String){
    override fun toString(): String{
        return "user with username : $username"
    }
}

class Company(val name:String){
    // * tanpa override
    // * jika object yang dibandingkan adalah object yang berbeda maka akan menghasilkan false

    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> this.name == other.name // * Membandingkan object jika property name sama maka true
            else -> false
        }
    }


}

fun main() {
    val user = Users("Admin","Admin")
    println(user) // * otomatis memanggil toString()

    val company1 = Company("Neptune")
    val company2 = Company("Neptune")

    println(company1 == company2)
    println(company1 == company1)

    // * hashCode
    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())





}