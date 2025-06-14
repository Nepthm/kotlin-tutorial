package Collection

/*
 ? RETRIVE BY POSITION

 ? RETRIVE SINGLE ELEMENTS BY POSITION
 * mengambil 1 element di collection menggunakan posisi

 ? OPERATOR RETRIVE SINGLE ELEMENT BY POSITION
 * elementAt(index) -> mengambil element pada posisi index
 * first() -> mengambil element pertama
 * last() -> mengambil element terakhir
 * elementAtOrNull(index) -> Mengambil element pada posisi index. Null jika tidak ada index
 * elementAtorElse(index, defaultValue) -> mengambil element pada posisi index. atau default value jika tidak ada index
 */

fun main() {
    val set = setOf("Noval","Putra","Asmara")

    // ? pada set tidak terdapat index namun dengan menggunakan elementAt dapat di ambil nilai berdasarkan index
    println(set.elementAt(0)) // ! WARNING -> jika collection bukan list maka akan di lakukan perulangan
    println(set.first())
    println(set.last())
    println(set.elementAtOrNull(2))
    println(set.elementAtOrNull(10))
    println(set.elementAtOrElse(10){"Tidak ada data yang ditemukan"})
}