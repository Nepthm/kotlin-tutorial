package OOP

// * Kemampuan membuat function dengan nama yang sama di dalam class
// * wajib menggunakan parameter yang berbeda
class person1{
    fun sayHello(username:String) : Unit{
        println("Hello $username")
    }
// ! Error karena sama
//    fun sayHello(username:String) : Unit{
//        println("Hello $username")
//    }
    // ! Error karena parameter masih sama
//    fun sayHello(username:String) : String{
//        println("Hello $username")
//    }

    fun sayHello(username:Int) : Unit{
        println("Hello $username")
    }
    fun sayHello(firstName:String, lastName:String) : Unit{
        println("Hello $firstName $lastName")
    }
}

fun main() {
    val p1 = person1()
    p1.sayHello("Nepts","val")
    p1.sayHello("Nepts")
}