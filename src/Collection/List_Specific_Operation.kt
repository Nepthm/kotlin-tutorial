package Collection

/*
 ? LIST SPECIFIC OPERATION
 * Merupakan operasi yang hanya ada pada List

 ? OPERATOR
 * getOrElse(index, (index) -> T) -> Mengambil element di index, jika tidak ada mengembalikan nilai lambda
 * getOrNull(index) -> mengambil element di index, jika tidak ada mengembalikan null
 * subList(from, to) -> Mengambil semua element dari from (inclusive) ke to (exclusive)
 * binarySearch(value) -> Melakukan pencarian menggunakan algoritma binary search ( harus di urutkan terlebih dahulu )

 ? OPERATOR 2
 * indexOf(value) -> Mengambil index element yang sama dengan value
 * lastIndex0f(value) -> Mengambil index element terakhir yang sama dengan value
 * indexOfFirst( (T) -> Boolean ) -> Mengambil index element yang sama dengan kondisi
 * indexOfLast ( (T) -> Boolean ) -> Mengambil index element terakhir yang sama dengan kondisi

 */

fun main() {
    val list = listOf("Noval", "Putra","Asmara")
    println(list.getOrNull(10))
    println(list.getOrElse(10){index -> "Data tidak ada"})
    println(list.subList(0,2))

    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Noval"))

    val numbers = listOf(1,1,2,2,3,3,4,4,5,5)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(3))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { it > 3 })
}