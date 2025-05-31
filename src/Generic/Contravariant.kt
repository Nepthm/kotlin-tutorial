package Generic

/*
 ? CONTRAVARIANT
 * Bisa melakukan subtitusi supertype (parent) dengan subtype (child)
 * Hanya class generic yang menggunakan generic parameter type sebagai parameter function
 * Contoh<Any> dapat di subtitusikan menjadi Contoh<String>
 * Gunakan keyword in
 */

// ! Generic hanya boleh di bagian inputan saja, tidak boleh di bagian return
class Contravariant <in T>{

    fun sayHello(name:T){
        return println("Hello $name")
    }
    // ! ERROR
//    fun getData() : T{
//        return data
//    }
}

fun main() {
    val data1 = Contravariant<Any>()
    val data2 : Contravariant<String> = data1
    data2.sayHello("Neptune")
}