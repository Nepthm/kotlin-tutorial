package OOP

class sayHello(var name:String) {
    fun say(){
        println("Hello")
    }
    fun sayName(user:String){
        println("Hello $user")
    }
}

fun main() {
 val s = sayHello("Nept")
    s.say()
    s.sayName("Val")
}