package Generic

/*
    ? COVARIANT
    * Artinya kita bisa melakukan subsitusi subtype (child ) dengan superType (parent)
    * Tidak semua jenis class generic yang mendukung covariant, hanya class generic yang menggunakan generic parameter type  sebagai return type function
    * Artinya saat kita membuat object Conoth<String>, maka bisa disubsitusi menjasi Contoh<Any>
    * Untuk memberitahu bahwa generic parameter type tersebut adalah covariant, kita perlu menggunakan katakunci out
 */
// ! Tidak boleh var & generic haruslah return value
class Covariant<out T>(val data:T){
    fun data() : T = data
}

fun main() {
    val data1:Covariant<String> = Covariant("Razer")
    val data2:Covariant<Any> = data1
    print(data2.data)
}