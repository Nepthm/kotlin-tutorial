package OOP

/** Abstract Class
 * tidak bisa dibuat object
 * Harus memiliki childClass
 * Bersifat open secara default
 */

/** Abstract properties & Function
 * Properties dan function yang bersifat abstract, artinya wajib dibuat ulang di class childnya
 */
abstract class Location(val name: String)
class City(name: String) : Location(name)

abstract class Animal{
    abstract val name:String
    abstract fun run():Unit
}

class Cat :Animal(){
    override val name: String = "Cat"
    override fun run() {
        println("Cat run")
    }

}
fun main() {
    // ! val location = Location("Jakarta") -> Error karena abstract tidak bisa di inisiasi
    val city = City("Jakarta");
    println(city.name)

    val cat = Cat()
    cat.run()
}