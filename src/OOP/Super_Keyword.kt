package OOP

// * Keyword super digunakan untuk mengacu pada parent class
// * oleh karena itu ketika ingin mengakses property di parent class maka dapat menggunakan keyword super
// * Hanya bisa mengakses 1 kali saja tidak bisa (super.super)



open class HP{
    open val merk:String = "Infinix"
    open fun printName(){
        println("Ini adalah HP")
    }
}
class HPGaming:HP(){
    override val merk:String = "Infinix GT"
    val merkParent = super.merk
    override fun printName() {
        println("Ini adalah HP gaming")
        super.printName()
    }
}

fun main(args: Array<String>) {
    val hp = HP()
    println(hp.merk)
    val hpGaming = HPGaming()
    println(hpGaming.merkParent)
    hp.printName()
    hpGaming.printName()
}