package Collection

/*
 ? REVERSE ORDER
 * Bisa mendapatkan collection dengan urutan data terbalik dari data aslinya

 ? OPERATION
 * reversed() -> Membuat collection baru dengan urutan terbalik dari collection aslinya ( membuat collection baru, jadi ketika ada penambahan pada collection yang di rubah maka tidak akan berdampak)
 * asReversed() -> Membuat view terhadap collection dengan urutan terbalik, jika collection aslinyua berubah, view pun akan ikut berubah ( masih terikat dengan collection atau data yang di rubah)
 */

fun main() {
    val list1 = mutableListOf("Noval","Putra","Asmara")
    val listReverse = list1.reversed()
    val listAsReverse = list1.asReversed()
    list1.add("Developer")
    println(listReverse) //* meskipun ada penambahan data pada list1, reversed() tidak akan terdampak
    println(listAsReverse) // * terdapat penambahan data
}