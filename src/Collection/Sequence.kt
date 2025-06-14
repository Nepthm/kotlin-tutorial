package Collection

/*
 ? SEQUENCE
 * Merupakan collection yang mengeksekusi semua operasi secara lazy
 * berbeda dengan collection biasa yang mengeksekusi semua operasi secara eager
 * Gunakan ketika data collection besar
 * Operasi colection kompleks dan banyak
 */

fun main() {
    // ? BUKAN SEQUENCE
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    println(words)
    val lengthList =
        words.filter { println("Filter : $it"); it.length > 3 } // * Melakukan filter semua kata
            .map { println("length : ${it.length}"); it.length } // * Mengambil panjang dari kata yang sudah di filter
            .take(4)

    println("Length of first 4 words longer than 3 chars : ")
    println(lengthList)

    println("====================================================================")
    // ? SEQUENCE
    val words1 = "The quick brown fox jumps over the lazy dog".split(" ")
    val wordsSequence = words1.asSequence()

    val lengthSequence =
        words.filter { println("Filter : $it"); it.length > 3 } // * Akan memfilter kata satu per satu, ketika kata tersebut memenuhi kondisi maka program akan melanjutkan ke operasi selanjutnya
            .map { println("length : ${it.length}"); it.length }
            .take(4)
    println("Length of first 4 words longer than 3 chars : ")
    println(lengthSequence.toList())
}