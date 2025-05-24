package OOP

// * Merupakan kemampuan membuat ulang function yang sudah ada di class parent
// * Secara standar fucntion di class adalah final, tidak bisa di override
// * agar bisa dibuat ulang maka tambahkan kata kunci open
// * Hanya boleh berbeda di body saja

// * Jika membuat function override maka default nya open

open class Employee(val name:String){
    open fun sayHello(name:String){
        println("Hello $name, My name is ${this.name}")
    }

    open fun jabatan(name:String){
        println("Jabatan saya adalah staff");
    }
}

open class manager(name:String) : Employee(name){
    // * Bersifat open
    override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
  final  override fun jabatan(name: String) {
        println("Jabatan saya adalah manager")
    }
}

class superManager(name:String):manager(name){
   // override fun jabatan() {} -> Error karena jabatan adalah final
}

class VicePresident(name: String):Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, My name is Vice President ${this.name}")
    }
}