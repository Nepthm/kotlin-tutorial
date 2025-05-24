package OOP

/*
 ? Delegation
 * Merupakan cara untuk meneruskan properties atau function ke object yang lain
 * Dalam delegation, properties dan fucntion secara otomatis akan di delegasikan ke object yang dipilih
 * Namun kita tetap bisa menng-override properies dan funciton jika mau
 */
interface Base{
    fun sayHello(name:String)
    fun sayGoodbye(name:String)
}

class myBase:Base{
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Goodbye $name")
    }
}

// * manual delegation
//class myBaseDelegate(val base:Base):Base{
//    override fun sayHello(name: String) {
//        base.sayHello(name)
//    }
//}

// * Delegation by keyword
class myBaseDelegate(val base:Base):Base by base

fun main() {
    val base = myBase()
    val delegate = myBaseDelegate(base)
    delegate.sayHello("neptune")
    delegate.sayGoodbye("saturn")
}