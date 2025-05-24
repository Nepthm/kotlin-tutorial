package Fundamental.Function

// * Var args -> Variabel Argument
// * varargs -> datanya bisa menerima lebih dari 1 input
// * JIka ingin menggunakan varargs maka harus diletakan di paling belakang

// * tanpa varargs
fun hitungTotal(param:Array<Int> ) : Int{
    var total = 0;
    for ( value in param){
        total += value;
    }
    return total;
}

// * Menggunakan varargs
// * Jika menggunakan varargs parameter tersebut boleh tidak diisi
fun hitungTotalVarargs(vararg param:Int) : Int{
    var total = 0;
    for(value in param){
        total += value;
    }

    return total;
}
fun main() {
    // * Tanpa varargs
    val angka = hitungTotal(arrayOf(2,4,5,2))
    println(angka)

    println(hitungTotalVarargs(10,30,40))

}