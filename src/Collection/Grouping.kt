package Collection

/*
 ? GROUPING
 * Operasi untuk meng-grup kan element yang ada di collection

 ? GROUPING OPERATORS
 * groupBy( (T) -> K) : Map<K, List<T>> -> menggabungkan collection menjadi group Map <K, List<T>>
 * groupingBy( (T) -> K) : Grouping(K, T> -> menggabungkan collection menjadi obejct Grouping<K,T>
 */

fun main() {
    val list1 = listOf("a","a","b","b","c","c","AA","BB")
    val map : Map<Int, List<String>> = list1.groupBy { it.length } // * Grup berdasar kan panjang
    val grouping : Grouping<String, String> = list1.groupingBy { it }

    println(map)
    println(grouping)
}