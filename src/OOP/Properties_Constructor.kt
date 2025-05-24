package OOP

// * Hanya dapat di gunakan pada primary constructor
class User(var paramUsername: String, val paramPassword:String){

}

fun main() {
    val user1 = User("Admin", "Admin#1234")
    println(user1.paramPassword)
    println(user1.paramUsername)
}