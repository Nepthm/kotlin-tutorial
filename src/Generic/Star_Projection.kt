package Generic
/*
 ? STAR PROJECTION
 * Kadaing ada kasus yang dimana kita tidak peduli dengan generic parameter pada object
 * Contoh mengambil panjang data Array<T>, dan kita tidak peduli dengan isi data T nya
 * Maka hal tersebut dapat menggunakan Star Projection dengan mengganti generic type dengan karakter ( * )
 */

class Star_Projection

fun displayLength(array : Array<*>){
    println("Length Array is ${array.size}")
}

fun main() {
    val arrayInt = arrayOf(1,2,3,5,5)
    val arrayString = arrayOf("Hello","Hola","Bonjour","Konichiwa")
    displayLength(arrayString)
    displayLength(arrayInt)
}