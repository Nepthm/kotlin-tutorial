package Collection

/*
 ? RETRIVE BY CONDITION

 ? RETRIVE SINGLE ELEMENTS BY CONDITION
 * Selain mengambil satu elemnet di collection berdasarkan posisi, dapat juga mengambil single element berdasarkan kondisi

 ? OPERATION
 * first( (T)-> Boolean) -> Mengambil element pertama yang sesuai kondisi
 * last ( (T) -> Boolean) -> mengambil element terakhit yang sesuai dengan kondisi
 * firstOrNull( (T) -> Boolean) atau find() -> mengambil element pertama yang sesuai dengan kondisi atau null jika tidak ada
 * lastOrNull( (T) -> Boolean) atau  findLast() -> mengambil element terakhir yang sesuai kondisi, atau null jika tidak ada
 */

fun main() {
    val range = (1..20).toList()
    println(range.first{it > 10})
    println(range.last{it > 10})
    println(range.firstOrNull{it > 50})
    println(range.lastOrNull(){it > 50})
    println(range.find{it > 50})
    println(range.findLast{it > 50})
}