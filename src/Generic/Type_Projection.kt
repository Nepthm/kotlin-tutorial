package Generic

/*
 ? TYPE PROJECTION
 * Merupakan cara untuk menambahkan informasi covariant atau contravariant di parameter function, ini memaksa isi function untuk melakukan pengecekan
 * Jika covariant, kita tidak boleh mengubah data generic di object
 * Jika contravariant, kita tidak boleh mengambil data generic di object
 */

class Container<T> (var data : T)

fun copyContainer(from : Container<out Any>, to:Container<in Any>){
    to.data = from.data;
}

fun main() {
    val container1 = Container("Neptune")
    val container2 : Container<Any> = Container("Algo")

    copyContainer(container1, container2)
}