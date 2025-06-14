package Collection

/*
 ? MAP SPECIFIC OPERATION
 * Merupakan operasi yang hanya ada pada Map

 ? OPERATION
 * getOrElse(key, (key) -> V ) -> Mengambil value sesuai key, jika tidak ada eksekusi lambda
 * getValue(key) -> Mengambil value sesuai key, atau throw exception
 * filter( (Entry<K,V>) -> Boolean ) -> Filter sesuai kondisi
 * filterKeys( (K) -> Boolean ) -> Filter dengan kondisi key
 * filterValues( (V) -> Boolean ) -> Filter dengan kondisi value

 */
fun main() {
    val map = mapOf("a" to "Noval", "b" to "Putra", "c " to " Asmara")

    println(map.getValue("a"))
    println(map.getOrElse("d"){"Data tidak ditemukan"})
    println(map.filter{ (key, value) -> value.length > 5})
    println(map.filterKeys { key -> key > "b" })
    println(map.filterValues { value -> value.length > 5 })
}
