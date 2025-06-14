package Collection

/*
 ? LIST
 * Adalah collection yang datanya seperti Array dan memiliki akses data menggunakan index
 * Boleh duplicate
 * Bersifat dinamis ( panjangnya menyesuaikan data yang di inputkan)
 * Bersifat immutable
 */

fun main() {
    val list:List<String> = listOf("Noval","Putra","Asmara")
    println(list[0])
    println(list.isEmpty())
    // * Case-sensitive
    println(list.contains("Putra"))
    println(list.containsAll(listOf("Noval","Putra")))
    println(list.indexOf("Noval")) // * jika -1 berarti false

    // ? Muttable LIst
    val muttableList : MutableList<String> = mutableListOf()
    muttableList.add("Algo")
    muttableList.add("Algorithm")
    muttableList.set(0, "neptsss")
    println(muttableList[0])
    muttableList.remove("Algorithm")
}