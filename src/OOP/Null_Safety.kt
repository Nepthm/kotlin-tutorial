package OOP

/*
 ? Null Safety
  * Null safety merupakan fitur yang ada di kotlin untuk menghindari null pointer exception
  * Null pointer exception adalah error yang terjadi ketika kita mengakses object yang bernilai null
  * Null safety di kotlin menggunakan operator ? dan !! untuk memberitahu bahwa object tersebut bisa bernilai null
  * Di kotlin tidak di rekomendasikan untuk menggunakan null
  * ( !! ) -> Tidak direkomendasikan untuk menggunakan operator tersebut karena jika ternyata datanya null maka akan error
  * Operator tersebut digunakan untuk memaksa kotlin untuk menganggap bahwa object tersebut tidak null
 */

data class Friend(val name:String)

fun sayHello(friend:Friend?): Unit{
//    println("Hello ${friend?.name}") -> safe call menggunakan ? operator

    // * Cek menggunakan if
//    if (friend != null){
//        println("Hello ${friend.name}")
//    }

    // * Elvis Operator
//    val name = friend?.name ?: " " // ? -> Jika null maka akan diisi dengan " "
//    println("Hello $name")

    // * !! Operator
    val name = friend!!.name
    println("Hello $name")
}

fun main() {
    sayHello("Putra")
    sayHello(null)
}