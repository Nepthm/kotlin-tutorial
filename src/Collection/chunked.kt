package Collection

/*
 ? CHUNKED
 * Merupakan operasi untuk memotong collection menjadi beberapa collection

 ? OPERATION CHUNKED
 * chunked(n) : List<List<tT>> -> Memotong collection menjadi beberapa collection dengan jumlah data n
 * chunked(n,(List<T>) -> R) : List<R> -> Memotong collection menjadi beberapa collection dengan jumlah data n, lalu melakukan transformasi LIst<T> menjadi R, sehingga menghasilkan List<R>
 */

fun main() {
    val range = (1..100).toList()
    val list1 = range.chunked(10)
    val list2 = range.chunked(10) { list: List<Int> ->
        var total = 0
        for (number in list) {
            total += number
        }
        total
    }

    println(list1) // * ambil per 10
    println(list2) // * jumlah kan element per 10
}