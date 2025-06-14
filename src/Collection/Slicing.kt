package Collection

/*
 ? SLICE
 * merupakan operator yang digunakna untuk mengambil sebagian element yang ada di collection sesuai dengan parameter range

 ? SLICE OPERATOR
 *slice() -> mengambil sebagian element yang ada di collection sesuai dengan index range

 */

fun main() {
    val list1 = (0..100).toList()
    val list2 = list1.slice(0..50) //* mengambil index ke 0 - 50
    val list3 = list1.slice(0..100 step 2)
    val list4 = list1.slice(100 downTo 0 step 2) // * mengambil index 100 - 0 dengan loncatan 2

    println(list1)
    println(list2)
    println(list3)
    println(list4)
}