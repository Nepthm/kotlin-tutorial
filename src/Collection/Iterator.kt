package Collection

/*
 ? ITERATOR
 * Memiliki child interface, yaitu ListIterator dan MutableListiterator
 * ListIterator digunakan oleh List dan MutableListIterator digunakan oleh MutableList
 * Set tetap menggunakan iterator
 * Sedangkan Map tidak mendukung Iterator
 */

fun <T> displayListIterator(listIterator : ListIterator<T>){
    while (listIterator.hasNext()) println(listIterator.next()) // * Print dari awal -> akhir
    while (listIterator.hasPrevious()) println(listIterator.previous()) // * Print dari akhir -> awal
}

fun <T> displayMutableListIterator(mutableListIterator : MutableListIterator<T>){
    while (mutableListIterator.hasNext()) println(mutableListIterator.next())
//    while (mutableListIterator.hasPrevious()) println(mutableListIterator.previous())
}

fun removeOodNumber(mutableListIterator : MutableListIterator<Int>){
    while (mutableListIterator.hasNext()){
        val item = mutableListIterator.next();
        if(item % 2== 1){
            mutableListIterator.remove()
        }
    }
}

fun main() {
    displayListIterator(listOf("Viper","Baracuda","Chroma").listIterator())

    // ? MuttableListIterator
    displayMutableListIterator(mutableListOf("GT","Note","Smart").listIterator())
    val mutable = mutableListOf(1, 4, 5, 10);
    removeOodNumber(mutable.listIterator())
    displayMutableListIterator(mutable.listIterator())
}