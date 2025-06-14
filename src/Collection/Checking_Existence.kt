package Collection

/*
 ? CHECKING EXISTENCE
 * kotlin mendukung operasi untuk mengecek apakah dalam colection terdapat data yang kita cari

 ? OPERATION
 * contains(element) : Boolean -> mengecek apakah terdapat element di collection
 * containsAll(Collection<T>) : Boolean -> mengecek apakah terdapat element collection T di collection
 * isEmpty() : Boolean -> mengecek apakah collection kosong
 * isNotEmpty() : Boolean -> mengecek apakah collection tidak kosong
 */

fun main() {
    val range = (1..10).toList();
    println(range.contains(3))
    println(range.containsAll(listOf(3,1,2)))
    println(range.isEmpty());
    println(range.isNotEmpty());
}