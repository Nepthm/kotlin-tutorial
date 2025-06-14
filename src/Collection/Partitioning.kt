package Collection

/*
 ? PARTITIONING
 * membagi collection menjadi dua, dimana collection pertama yang masuk  filtering dan collection kedua yang tidak masuk filtering

 ? OPERATION
 * partition( (T) -> Boolean) : Pair<List<T>, List<T>> -> mempartisi collection dengan filtering sehingga menghasilkan pair collection T yang masuk filter, dan collection T yang tidak masuk filter
 */

fun main() {
    val list1:List<String> = listOf("Razer","Fantect","Rexus")
//    val pair:Pair<List<String>, List<String>> = list1.partition { it .length> 5 }
    // * Versi singkat
    val (listMatch, listNotMatch) = list1.partition { it .length> 5 }
    println(listMatch)
    println(listNotMatch)

}
