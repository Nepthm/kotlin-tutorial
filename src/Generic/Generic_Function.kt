package Generic

/*
 ? GENERIC FUNCTION
 * Generic parameter type yang di deklarasikan di function , hanya bisa di akses di funciton tersebut, tidak bisa digunakan di luar function
 * Cocok jika ingin membuat generic funciton, tanpa harus mengubah deklarasi class
 */
class Generic_Function (val name :String) {
    fun<T> sayHello(param:T){
        println("Hello $param, My name is $name")
    }
}

fun main() {
    val function = Generic_Function("Noval");

    function.sayHello<String>("Neptune")
    function.sayHello("Budi")

    function.sayHello<Int>(100)
    function.sayHello(30.1) // * Kotlin dapat mendeteksi langsung tipe data yang digunakan
}