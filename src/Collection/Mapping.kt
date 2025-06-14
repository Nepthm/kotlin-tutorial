package Collection

/*
 ? TRANSFORMATIONS : MAPPING
 * Digunakan untuk mengubah data ke data lain
 * Mapping akan membutuhkan lambda function sebagai parameter, dan akan mengembalikan collection hasil result lambdanya
 * urutan collection baru hasil dari mapping adalah sama dengan urutan collection aslinya

 ? TRANSFORMATION : MAPPING OPERATIONS
 * map (transform : (T) -> R) -> Mengubah collection menjadi collection baru sesuai lambda transform
 * mapIndexed(transform:(index, T) -> R ) -> Mengubah collection menjadi collection baru, dengan tambahan parameter index
 * mapNotNull(transform : (T) -> R ) : Sama seperti map(), namun menghiraukan nilai null
 * mapIndexedNotNull(transform:(index, T) -> R) -> Sama seperti mapIndeced(), namun menghiraukan nilai null

 ? Mapping Operations untuk Map
 * mapKeys(transform (Entry <K, V> )-> R ) -> Mengubah map menjadi map baru dengan nilai key baru sesuai dengan lambda transform
 * mapValues(transform : (Entry<K,V) -> R ) -> Mengubah map menjadi map baru dengan nilai value baru sesuai dengan lambda transform
 */

fun main() {
    val list1: List<String> = listOf("Noval", "Putra", "Asmara")
    val list2: List<String> = list1.map { item -> item.uppercase() }
    val list3: List<Int> = list1.map { item -> item.length }
    val list4: List<String> = list1.mapNotNull { value -> if (value == "Noval") value else null }

    val map1: Map<Int, String> = mapOf(
        1 to "Unknown",
        2 to "Anonymous",
        3 to "Undefined"
    )

    val map2: Map<Int, String> = map1.mapKeys { it.key * 10 }
    val map3: Map<Int, String> = map1.mapValues { it.value.uppercase() }

    print(map2)
    print(map3)
}

