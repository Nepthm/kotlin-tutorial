package Collection

/*
 ? FLATTENING
 * Merupakan operati Trnasformasi untuk menjadikan nested collection menjadi flat(digabung)

 ? FLATTENING OPERATION
 * flatten -> Mengubah nested collection menjadi flat collection
 * flatMap( (T) -> iterable<R> ) -> mengubah collection T menjadi flat collection R
 */

private class Member(val name:String, val hobbies:List<String>)

fun main() {
    val list1:List<List<String>> = listOf(
        listOf("Noval","Putra"),
        listOf("Android","Development"),
    )

    val list2:List<String> = list1.flatten()
    println(list2)

    // ? FlatMap
    val members : List<Member> = listOf(
        Member("noval", listOf("Coding","Gaming")),
        Member("Another", listOf("Coding","Sleep"))
    )

    val hobies : List<String> = members.flatMap{it.hobbies}
    print(hobies)

}