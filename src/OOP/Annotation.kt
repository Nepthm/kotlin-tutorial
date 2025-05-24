package OOP

/*
 ? ANNOTATION
 * Merupakan cara untuk menambahkan metadata ke kode program yang dibuat
 * Biasa di gunakan untuk pembuatan library atau framework
 * Bisa di akses menggunakan reflection
 * Untuk membuat annotation gunakan keyword annotation sebelum membuat class
 * Hanya boleh memiliki properties via primary constructor, tidak boleh memiliki members lainnya (function atau properties via body)
 */

/*
 ? ATTRIBUTE ANNOTATION
 * @Target -> memberitahu annotation bisa digunakan di mana (class, function, properties, dll) [ Array : bisa lebih dari 1 ]
 * @Retention -> memberitahu annotation apakah di simpan di hasil kompolasi, adan apakah bisa dibaca oleh reflection
 * @Repeatable -> memberitahu annotaion apakah bisa digunakan lebih dari sekali di target yang sama
 * @MustBeDocumented -> memberitahu annotation apakah perlu di dokumentasikan di public API
 */

@Target(AnnotationTarget.CLASS) // * -> Annotation hanya bisa di gunakan di class
@Retention(AnnotationRetention.RUNTIME) // * -> Bisa di baca dengan reflection
@MustBeDocumented // * -> Memberitahu ketika hasil dokumentasi annotation ini disertakan juga
annotation class Fancy(val author :String)

@Fancy("Neptsss")
class MyApplication(val name:String, val version:Int){
    fun info() : String {
        return "name : $name, version : $version"
    }
}

fun main() {
    val app = MyApplication("The begining", 1)
    println(app.info())
}
