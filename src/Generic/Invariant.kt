package Generic

/*
 ? INVARIANT
 * Secara default saat membuat generic parameter type, sifat parameter tersebut adalah invariant
 * Artinya tidak boleh di subsitusi dengan subtype (child) atau supertype (parent)
 * Artinya saat membuat object Contoh<String>, maka tidak sama dengan Contoh<Any> begitu pula sebaliknya, saat membuat object Contoh<Any> maka tidak sama dengan Contoh<String>

 */
class Invariant<T> (val data : T){
}

fun main() {
    val data1 : Invariant<String> = Invariant("neptune")
//   ! val data2: Invariant<Any> = data1 -> Error karena data1 merupakan Invariant<String> bukan <Any>
}