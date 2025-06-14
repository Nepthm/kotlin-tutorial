package Collection

import java.lang.StringBuilder

/*
 ? STRING REPRESENTATION
 * Operasi transformasi untuk mengubah collection menjadi string

 ? STRING REPRESENTASION OPERATION
 * joinToString(separator, prefix, suffix) -> Mengubah collection menjadi string dengan seperator, prefix dan suffix
 * joinToString(separator, prefix, suffix, transform) -> Mengubah collection menjadi string dengan separator, prefix, dan suffix, namun akan diubah dalam transform terlebih dahulu
 * joinTo(Appendable, seperator, prefix, suffix, transform) -> Sama seperi joinToString, namun string ditambahkan ke Appendable
 */

fun main() {
    val names = listOf("Noval","Putra","Asmara")
    println(names.joinToString(" ","|","|"))
    println(names.joinToString(" ","|","|"){string -> "Item $string"})

    val appendable = StringBuilder()
    names.joinTo(appendable, ",","|","|"){it}
    println(appendable.toString())
}