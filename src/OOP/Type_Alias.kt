package OOP
/*
? Type 
* Memuat nama berbeda dari tipe data yang sudah ada
* Biasanya digunakan ketika ada tipe data dengan nama yan gsama atau untuk mempersingkat tipe data 
*/

typealias Pelajar = Student
typealias Murid = Pelajar

// * typealias funciton
typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main(args: Array<String>) {
    val pelajar = Pelajar("Noval")
    val murid = Murid("Putra")
    println(pelajar.name)
    println(murid.name)
    sayHello { "Noval" }
}