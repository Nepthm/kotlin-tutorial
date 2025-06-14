package Collection

/*
 ? COLLECTION OPERATION
 * Merupakan extension tambahan berupa extension function yang selalu menghasilkan collection baru, tanpa mengubah data collection aslinya
 * Oleh karena itu, collection operations di kotlin sangat aman ketika dilakukan karena tidak akan mengubah collection aslinya

 ? JENIS OPERATION
  * Transformations, melakukan transformasi terhadap collection
  * Filtering, melakukan filtering atau seleksi terhadap collection
  * plus and minus operators, operasi + dan - terhadap collection
  * Grouping, melakukan pemisahan dalam group terhadap collection
  * Retrieving collection parts, mengambil sebagian data di collection
  * Retrieving single elements, mengambil satu data di collection
  * Ordering, melakukan pengurutan data di collection
  * Aggregate operations, melakukan agregasi terhadap data yang ada di collection

 */

fun main() {
    listOf("Noval", "Putra").forEach{value -> println(value)}
    listOf("Razer","Leaven").forEachIndexed { index, value -> println("$index = $value")  }
}

