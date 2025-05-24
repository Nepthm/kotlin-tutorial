package Fundamental.Function

fun sayHello (name:String ="Nepts"){
    println("Hello $name")
}

fun main() {
    // * Ketika di dalam paremeter terdapat default argumen maka saat memanggil function boleh tidak menambahkan argumen
    sayHello();
    // * Boleh juga mengisikan argumen
    sayHello("Neptune")
    // * namun ketika ada parameter yang tidak memiliki nilai default maka harus di isi
}