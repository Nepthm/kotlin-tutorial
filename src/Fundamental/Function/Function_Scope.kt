package Fundamental.Function

/*
 * Merupakan ruang lingkup dimana sebuah function bisa diakses
 * Dapat dibuat function dalam function
 */

fun cobaFunction(){
  // !  sayHellos(); -> Error karena function sayHellos merupakan inner function dari function main
}

fun main() {
    // ? Hanya dapat diakes pada function main
    fun sayHellos(name:String){
        println("Hello $name")
    }
}