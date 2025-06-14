package Collection

/*
 ? TRANSFORMATIONS : ZIPPING
 * merupakan transformasi yang di gunakan untuk menggabungkan dua buah collection

 ? TRANSFORMATIONS : ZIPPING OPERATIONS
 * zip(collection) -> Menggabungkan dua collection , sehingga menghasilkan Pair<T1, T2>
 * zip(collection, transform :(T1, T2) -> R) -> Menggabungkan dua collection dengan lambda transform sehingga menghasilkan collection baru dari result lambda transfrom

 ? UNZIP
 * unzip() -> mengubah collection Pair<T1, T2> menjadi dua collection, collection T1 dan collection T2
 */

fun main() {
    val list1 = listOf("Noval","Putra","Asmara")
    val list2 = listOf("Android","Development")

    val list3 : List<Pair<String, String>> = list1.zip(list2);
    val list4 : List<String> = list1.zip(list2){
        item1, item2 -> item1 + item2 // * Menggabungkan item dari list1 dan 2
    };

    println(list3)
    println(list4)

    // ? UNZIP -> Harus Pair
    val list: List<Pair<String, String>> = listOf(
        "name" to "Noval",
        "age" to "19",
        "year" to "2005"
    )

    val pair : Pair<List<String>, List<String>> = list.unzip();
    println(pair.first)
    println(pair.second)
}