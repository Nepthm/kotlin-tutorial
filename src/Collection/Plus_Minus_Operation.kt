package Collection

/*
 ? PLUS & MINUS OPERATION
 * Merupakan extension function
 * paramter pertama adalah colection dan parameter selanjutnya bisacollection atau element dan akan menghasilkan collection baru ( TIDAK MERUBAH DATA COLLECTION )

 ? PLUS & MINUS
 * plus(element) -> Membuat collection baru dengan menambahkan element
 * plus(collection) -> Membuat collection baru dengan menambahkan collection
 * minus(element) -> Membuat collection baru dengan menghapus element
 * minus(collection) -> Membuat collection baru dengan menghapus collection
 */


fun main() {
    val list1 = listOf("Noval","Putra","Asmara")
    val list2 = list1 + "Programmer"
    val list3 = list1 + listOf("Android", "Development")
    println(list1)
    println(list2)
    println(list3)

    val list4 = list1 - "Asmara"
    val list5 = list1 - listOf("Noval", "Android")
    println(list4)
    println(list5)

    val map1 = mapOf("a" to "Allo")
    val map2 = map1 + ("b" to "Bolla")
    val map3 = map1 - "b"

    println(map1)
    println(map2)
    println(map3)
}
