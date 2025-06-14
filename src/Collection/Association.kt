package Collection

/*
 ? ASSOCIATION
 * Merupakan operasi transformasi dari collection menjadi map
 * Dalam beberapa operasi association, element hasil bisa menjadi key atau value

 ? ASSOCIATION OPERATION
 * associate((T) -> Pair<K, V>) -> Merubah collection T menjadi Map<K, V>
 * associateWith(T->V) -> Merubah collection T menjadi Map<T,V>
 * associateBy( T-> K ) -> Merubah collection T menjadi Map<K,T>
*/


fun main() {
    val list1 = listOf("Noval","Putra","Asmara")
    val map1 : Map<String,Int> = list1.associate { Pair(it, it.length) }
    val map2 : Map<String, Int> = list1.associateWith { it.length } // * Membentuk value
    val map3 : Map<Int,String> = list1.associateBy { it.length } // * Membentuk Key

    println(map1)
    println(map2)
    println(map3)
}

