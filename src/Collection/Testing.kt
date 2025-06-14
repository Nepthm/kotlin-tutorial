package Collection

/*
    ? TESTING
    * Merupakan operation yang bisa digunakan untuk mengecek isi data dari collection
    * Hasil dari filtering terting adalh boolean, dimana true jika sesuai dan false jika tidak sesuai kondisi

    ? TESTING OPERATION
    * any( (T) -> Boolean) : Boolean -> Mengecek apakah minimal ada satu data sesuai dengan kondisi
    * none( (T) -> Boolean) : Boolean -> Mengecek apakah tidak ada satupun data sesuai dengan kondisi
    * all ( (T) -> Boolean) : Boolean -> Mengecek apakah semua data sesuai dengan kondisi
    * any() -> Apakah collection memiliki data
    * none() -> Apakah collection tidak punya data
 */

fun main() {
    val list = listOf("Noval","Putra","Asmara")
    println(list.any{it.length > 5})
    println(list.none{it.length > 5})
    println(list.all{it.length > 5})
    println(list.any())
    println(list.none())
}

