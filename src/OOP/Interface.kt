package OOP

/**
 * Interface
 * Merupakan blueprint
 * Tidak bisa di buat object
 * Hanya bisa di turunkan, biasanya digunakan untuk kontrak class
 * Secara standar property dan function bersifat abstract
 * Class dapat memiliki lebih dari satu interface
 * Interface dapat melakukan inheritance ke interface lain, namun tidak bisa jika ke class
 * pada Interface dapat mengguakan super
 */

interface Interaction{
    val name:String
    // * Dapat di tambahkan body (concrete)
    fun sayhello(name:String)
    fun sayHello(name:String){
        println("Hello $name")
    }
}

interface Go : Interaction {
    fun go(){
        println("Go")
    }
}

interface moveA{
    fun move() = println("Move A")
}
interface moveB{
    fun move() = println("Move B")
}

// * Class hanya bisa memiliki 1 parent class
class Human(override val name:String):Interaction,Go,moveA, moveB{
    override fun sayhello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
    override fun move() {
       super<moveA>.move() // * mengambil function move dari intreface moveA
    }
}

fun main() {
    val human = Human("Noval")
    human.sayhello("Neptune")
    human.sayHello("Neptsss")
    println(human.name)
}