package OOP

/**
 * Sealed Class
 * Merupakan jenis class yang didesain untuk inheritance
 * Tidak bisa di instansiasi menjadi object, dan secara standar sealed class merupakan abstract class
 * Sangat cocok digunakan sebagai class Parent
 * Biasa digunakan untuk kombinasi when expression
 * Dengan menggunakan sealed class kita bisa membatasi hanya class turunanya saja yang perlu di check
 */

sealed class Operation(val name:String)
class Plus : Operation("Add")
class Minus : Operation("Minus")

// * when di sealed class
fun operation(value1:Int, value2:Int, operation:Operation) : Int{
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        else -> 0
    }
}

fun main() {
    println(operation(10, 3, Plus()))
}