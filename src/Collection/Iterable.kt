package Collection

/*
? ITERABLE
* Merupakan superclass dari Collection Interface
* Adalah generasi operation untuk melakukan iterasi seluruh data di collection atau menghapus data di collection
 */

fun <T> displayIterable(iterable : Iterable<T>){
    //* Otomatis
//    for(value in iterable){
//        println(value)
//    }
    // * manual looping
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
        println(value)
    }
}

fun <T> displayMutableIterable(iterable : MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
       // ? iterator.remove()  Hapus data di iterasi saat ini
        println(value)
    }
}
fun main() {
    displayIterable(listOf("Neptune","Saturns","Mars"))
    displayMutableIterable(mutableListOf("Neptune","Saturns","Mars"))
}