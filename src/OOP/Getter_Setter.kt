package OOP

/**
 * Getter & Setter
 * Getter -> mengambil data properties
 * Setter -> mengubah data properties
 * val -> hanya bisa menggunakan getter, karena tidak bisa berubah
 * Tidak wajib digunakan pada Kotlin
 */

class Note(title: String) {
    var title: String = title
        get() {
            println("Call getter function")
            return field
        }
        set(value) {
            println("Call setter function")

            if (value.isNotBlank()) {
                field = value
            }
        }
}

class BigNote(val title: String){
    val bigTitle :String
        get() = title.uppercase();
}

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title) // * -> mengambil getter secara otomatis
    note.title = "Belajar java" // * -> memanggil setter secara otomatis
    println(note.title)

    val bigNote = BigNote("belajar PHP")
    println(bigNote.title)
    println(bigNote.bigTitle)
}