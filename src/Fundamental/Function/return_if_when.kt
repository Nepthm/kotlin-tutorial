package Fundamental.Function

fun main() {
    fun sayHello(name:String = ""): String{
        return if(name == ""){
            "Hello Bro"
        }else {
            "Hello $name"
        }
    }

    fun whenYa(rank:String = ""): String{
        return when(rank){
            ""-> "Whennn ya push rank"
            else -> "whenn ya push sampe $rank"

        }
    }


    println(sayHello())
    println(sayHello("Hello world"))

    println(whenYa())
    println(whenYa("Epic 100"))


}
