package OOP

/*
 ? Destructuring Declartion
 * Merupakan cara untuk membuat multiple variabel dari sebauh object
 * Tidak bisa dilakukan untuk semua object, hanya object yang memiliki function componenX() yang bisa dilakukan destructuring
 * Saat membuat clas, secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah parameternya
 * Dapat juga dilakukan ketika memanggil function
 * Dapat juga dilakukan di lambda parameter
 */

// * Tanpa data class
//class Game( val name:String, val price:Int){
//   operator fun component1():String = name
//   operator fun component2():Int = price
//}

// * Menggunakan data class
data class Game( val name:String, val price:Int)
data class MinMax(val min: Int, val max:Int)
data class Login(val username:String, val password:String)


fun minMax(value1:Int, value2:Int) : MinMax{
  return when{
      value1 > value2 -> MinMax(value2, value1)
      else -> MinMax(value1, value2)
  }
}

fun login(login : Login, callback:(Login) -> Boolean) : Boolean{
    return callback(login)
}

fun main() {
    val game = Game("Wuthering waves", 0 )
    // * Destructuring
    val (name,price) = game
    println("Game name : $name")
    println("Price : $price")

    // * Desturcturing dengan function
    val result = minMax(10, 100)
    // * Jika tidak ingin menampilkan semua variabel, bisa menggunakan underscore
//    val (min, max) = result
    val (min, _) = result
    println("Min : $min")
//    println("Max : $max")

    val loginData = Login("noval", "Admin#1234")
    // * Tanpa destructuring
//    login(loginData){ loginData ->
//       loginData.username == "noval" && loginData.password == "Admin#1234"
//    }
    login(loginData){ (username, password)->
        username == "noval" && password == "Admin#1234"
    }

}