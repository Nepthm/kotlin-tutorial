package OOP

/**
 * Inner class
 * merupakan class yang di deklarasikan di dalam class
 * Tidak bisa mengakses data yang ada di dalam class outernya
 * Jika ingin mengakses gunakan keyword inner
 */
class Boss (val name:String) {
   inner class Employee(val name: String) {
        fun hi() {
            println("Hi, my name is $name, and my boss is ${this@Boss.name}")
        }
    }
}

fun main() {
//  !  val employee = Boss.Employee("Noval") -> Error, karena class Employee menempel di class Boss (inner)
    // * Cara mengakses class inner
    val boss1 = Boss("Noval")
    val employee= boss1.Employee("Putra")
    println(employee.hi())
}