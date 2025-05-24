package OOP

/**
 * Extension Function
 * Extension function hanyalan sebuh function bantuan yang artinya, kita tidak bisa mengakses data private atau protected dari class tersebut
 *
 */

class Students (val nam:String, private val age:Int)

fun Students.sayhello(name:String){
    // !  println("Hello $name, my name is ${this.name}")  Error karena private
}

// * Nullable
fun Students?.sayGoodBye(name:String){
 if (this != null){
     print("Goodbye $name, my name is $name")
 }
}
fun main() {
    val student : Students = Students("Joni", 29)
    student.sayhello("Age")
}