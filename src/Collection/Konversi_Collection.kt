package Collection

/*
 ? KOBVERSI COLLECTION
 * Dapat mengubah collection ke collection lain, misalnya array ke list atau dari range ke set
 * semua function dimulai dengna kata "to", -> toList, toSet, dll
 */

fun main() {
    val array = arrayOf(1,2,3,4);
    val range = 1..100
    val list = range.toList()
    val mutableList = array.toMutableList();
    val set = list.toSet();
    val mutableSet = list.toMutableSet();
    val sortedSet = list.toSortedSet();


}