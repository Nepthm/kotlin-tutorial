package OOP

// * Merupakan keyword yang bisa diguakan untuk merefrensi kan object saat ini
// * this hanay bisa digunakan di dalam clas itu sendiri
// * biasanya digunakan untuk mengakses properties yang tertutup oleh parameter dengan nama yang sama

class Student(val name:String){
    fun sayHello(name:String){
        // * $ name -> akan mengambil parameter di funciton bukan di constructor
//        println("Hello $name, my name is $name")
        println("Hello $name, my name is ${this.name}")
    }
}