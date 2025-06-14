package Collection

/*
 ? COLLECTION
 * Semua data collection adalah turunan dari interface collection
 * Collection digunakan sebagai general operation terhadap struktur data collection, seperti embaca dan menulis data di collection
 */

fun <T> displayCollection(collection: Collection<T>) {
    for (elemen in collection) {
        println(elemen)
    }
}fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (elemen in collection) {
        println(elemen)
    }
}


fun main() {
    displayCollection(listOf("Razer", "Fantech"))
    displayCollection(setOf("Razer", "Fantech"))
    displayCollection(mapOf("Razer" to "Fantech").entries) // * Bisa karena entries mengembalikan set
//   ! displayCollection(mapOf("Razer" to "Fantech")) -> Error, Map nukan turunan collection

    // ? Muttable Collection
    displayMutableCollection(mutableListOf("Razer", "Fantech"))
//   ! displayMutableCollection(setOf("Razer", "Fantech")) Error, karena bukan turunan MuttableCollection
    displayMutableCollection(mutableSetOf("Razer", "Fantech"))
    displayMutableCollection(mutableMapOf("Razer" to "Fantech").entries)
}