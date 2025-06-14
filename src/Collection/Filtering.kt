package Collection

/*
 ? FILTERING
 * BIsa menggunakkan predicate berupa lambda yang berisi kondis filternya
 * Jika return dari predicate tersebut true, maka data di terima jika false maka data dibuang

 ? PREDICATE OPERATION
 * filter( (T) -> Boolean) -> melakukan filtering terhadap collection
 * filterIndexed( (index, T) -> Boolean ) -> Melakukan filtering terhadap collection, dengan tambahakn informasi index
 * filterNot ((T) -> Boolean) -> Kebalikan dari filter( (T) -> Boolean)
 * filterIsInstance<T>() -> Mengambil hanya data instant dari T
 * filterNotNull() -> Mengambil hanya data yang tidak null
 */

// * Tidak akan menghapus data dari list aslinya

fun main() {
    val list1 = listOf("Noval","Putra","Asmara")
    val list2 = list1.filter{it.length > 5}
    val list3 = list1.filterIndexed{index, value -> index % 2== 0}

    val list4 : List<Any?> = listOf(null, 1, "Hello","World",2,null)
    val list5 : List<String> = list4.filterIsInstance<String>()
    val list6 : List<Any> = list4.filterNotNull()

    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(list5)
    println(list6)
}