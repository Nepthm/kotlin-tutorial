package Collection

/*
 ? MAP
 * Adalah collection yang berbentuk key-value, dimana key berperan sebagai index
 * key harus unik, jika kita menggunakan key yang sama maka data sebelumnya akan di replace oleh  data yang baru
 * Tipe data key bisa menggunakan tipe data apapun sesuai yang kita inginkan
 */

fun main() {
    val map : Map<String, String> = mapOf(
        "a" to "Aja",
        "b" to "Babi",
        "c" to "cawan"
    )

    for((key, value) in map){
        println("$key to $value")
    }

    // ? Muttable Map
    val mutableMap : MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a","Aloha")
    mutableMap.put("b","bye bye")

    println(mutableMap["a"])
    println(mutableMap.get("b"))
    println(mutableMap.getOrDefault("c","Tidak Ada")) // * Jika key c tidak ada maka akan menampilkan default

    mutableMap.remove("a")
    for((key, value) in mutableMap){
        println("$key to $value")
    }
}