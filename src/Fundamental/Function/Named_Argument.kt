package Fundamental.Function

// ? Named Argument
// * Merupakan fitur kotlin yang dapat menyebutkan nama parameter saat memanggil function
// * Dengan demikian penulisan parameter tidak harus berurutan

fun sayhello (firstName:String, middleName:String, lastName:String){
    print("Hello $firstName $middleName $lastName")
}
fun main(args: Array<String>) {
    // * Dengan menggunakan named argument kita bisa menuliskan parameter tidak berurutan
    sayhello(lastName = "Nept", firstName = "Kusajishi", middleName = "Yamamoto")
    // * Namun jika kita tidak menggunakan named argument maka kita harus menuliskan parameter sesuai urutan
    sayhello("Kusajishi", "Yamamoto", "Nept")
}