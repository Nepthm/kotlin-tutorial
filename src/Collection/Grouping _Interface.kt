package Collection

/*
 ? GROUPING INTERFACE

  ? OPERATION
  * eachCount() -> menghitung jumlah data di tiap group
  * reduce dan fold() -> operasi reduce dan fold di tiap group
  * aggregate(key : K, accumulator: R?, element: T, first: Boolean) -> operasi aggregate data di tiap group, dimana jika data pertama dimana parameter first bernilai true, dan accumulator akan bernilai null.
 */

fun main() {
    val list1 = listOf("a","a","b","b","c","c","c")
    val grouping : Grouping<String, String> = list1.groupingBy { it }
    println(grouping.eachCount())
    println(grouping.fold("q"){accumulator, element -> accumulator + element})
    println(grouping.reduce{key,accumulator, element -> accumulator + element})
    println(grouping.aggregate { key, accumulator: String?, element, isFirst ->
        if (isFirst) element
        else accumulator + element
    })
}