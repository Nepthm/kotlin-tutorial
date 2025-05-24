package OOP

/**
 * Extension Properties
 * dibuat dengan get dan set
 **/

val Student.upperCaseName:String
    get() = this.name.uppercase()

fun main() {
    val student : Student = Student("Joni")
    println(student.upperCaseName)
}