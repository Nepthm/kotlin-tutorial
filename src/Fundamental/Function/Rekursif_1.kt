package Fundamental.Function

fun main() {
    // * Recursive function -> function yang memanggil function nya sendiri
    // menggunakan looping
    fun factorial(value: Int): Int {
        var result = 1;
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }

    // ? menggunakan recursive function
    fun factorialRecursive(value:Int) : Int{
        return when(value){
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }
}