package OOP

/*
 ? SCOPE FUNCTION
 * Kotlin memiliki standar library yang berisikan beberapa function yang bisa digunakna untuk mengeksekusi object dengan mudah memanfaatkan lambda expression
 * Function tersebut adalah ( let, run , with, apply, dan also )
 */

/*
 ? let
 * Bisa digunakan sebagai refrence block agar kita bisa lebih mudah ketika ingin memanipulasi sebuah object
 * memiliki parameter object itu sendiri, sehingga dapat menggunakan kata kunci it untuk mendapatkan referensi terhadap pobject tersebut
 */

/*
 ? run
 * Mirip dengan let
 * Tidak memiliki parameter pada lambda, sehingga kita tidak bisa mengakses reference object menggunakan kata kunci it. Namun kita masih bisa menggunakan kata kunci this
 */

/*
 ? apply
 * Hampir sama dengan run
 * Namun return value dari apply function ada reference object itu sendiri
 */

/*
 ? also
 * Mirip dengan let
 * Namun return valuenya adalah reference ke object itu sendiri
 */

/*
 ? with
 * Mirip dengan run
 * Bukanlah extension function, jadi tidak bisa digunakan langsung dari object nya
 * Harus memanggil secara manual
 */

fun main() {
    val student = Student("Noval")
    student.let {
        println(it.name)
        "Hello ${it.name}"
    }

    val result = student.run {
        "Hello ${this.name}"
    }
    println(result)

    val result2 = student.apply {
        "Hello ${this.name}"
    }
    println(result2)

    val result3 = student.also {
        "Name ${it.name}"
    }
    println(result3)

    val result4 = with(student){
        "Name ${this.name}"
    }
    println(result4)
}