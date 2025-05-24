package OOP

import javax.lang.model.element.ExecutableElement

// * Super Constructor
// * hanya bisa diakses di dalam constructor class child

open class Customer(val name:String, val type:String, val balance:Long){
    constructor(name:String, type:String) : this(name,type, 0)
    constructor(name: String):this(name, "Standard")
}

// * tidak menggunakan primary constructor
// * karena jika menggunakan primary maka secondary constructor wajib mengakses primary
// class PremiumCustomer()
class PremiumCustomer : Customer{
    constructor(name:String):super(name, "Premium")
    constructor(name:String, balance: Long):super(name, "Premium",balance)
}

class ExecutiveCustomer(name:String,balance: Long):Customer(name,"Executive",balance){
    constructor(name:String):this(name,0) // * Tidak menggunakan super karena harus mengakses primary
}

fun main() {
    val premiumCus = PremiumCustomer("Noval")
    println(premiumCus.name)

    val executiveCustomer= ExecutiveCustomer("Neptsss",10000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}