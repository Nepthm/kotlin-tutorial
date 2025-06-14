package Collection

/*
 ? TAKE & DROP
 * Untuk mengambil sebagian element di collection, selain menggunakan slice, dapat juga menggunakan operator take & drop

 ? TAKE OPERATION
 * take(n) -> mengambil collection diawal sejumalh n
 * takeLast(n) -> mengambil collection diakhir sejumlah n
 * takeWhile( (T) -> Boolean ) -> Mengambil element dari awal selama kondisi berniali true, jika false, maka berhenti
 * takeLastWhile( (T) -> Boolean ) -> Sama seperti takeWhile, namun dimulai dari element terakhir

 ? DROP OPERATION
 * drop(n) -> menghapus collection diawal sejumalh n
 * dropLast(n) -> menghapus collection diakhir sejumlah n
 * dropWhile( (T) -> Boolean ) -> menghapus element dari awal selama kondisi berniali true, jika false, maka berhenti
 * dropLastWhile( (T) -> Boolean ) -> Sama seperti dropWhile, namun dimulai dari element terakhir
 */

fun main() {
    val chars = ('a'..'z').toList()

    println(chars.take(3))
    println(chars.takeLast(3))
    println(chars.takeWhile{it < 'f'})
    println(chars.takeLastWhile { it > 'w' })

    println(chars.drop(3))
    println(chars.dropLast(3))
    println(chars.dropWhile{it < 'f'})
    println(chars.dropLastWhile { it > 'w' })
}
