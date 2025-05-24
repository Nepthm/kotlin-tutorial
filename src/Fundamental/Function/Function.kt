package Fundamental.Function

fun main() {
    myFunction()
    myName("Neptsss")
    var result = sum(5);
    println(result);
    println(jumlah(2,5));
}

fun myFunction() {
    println("hello world")
}

// * Function dengan parameter
fun myName(name: String) {
    println("Hello $name")
}

// * function dengan return
// * fun <nama_function> (paremeter) : <return_type> {}
fun sum (x: Int) : Int{
    return(x + 4);
}

// * Jika hanya 1 baris pada function maka dapat disingkat dengan
fun jumlah(x: Int, y :Int) = x + y;