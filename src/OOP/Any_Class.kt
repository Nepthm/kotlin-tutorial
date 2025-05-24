package OOP

// * Merupakan superclass untuk semua class yang dibuat di kotlin
class Laptop(val name:String){

}
class HandPhone(val name:String){

}

fun main() {
    val laptop = Laptop("Asus")
    println(laptop.toString()) // * toString() berasal dari class Any 
}