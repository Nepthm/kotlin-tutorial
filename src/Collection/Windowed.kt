package Collection

/*
 ? WINDOWED
 * Operasi untuk mendapatkan semua kemungkinan collection dengan range yang telah ditentukan

 ? OPERATION
 * windowed(size, step, partialWindow) -> mengambil semua kemungkinan collection sebesar size, dilanjut dengan step, dan siakhiri dengan partial window
 * windowed(size, step, partialWindow, transform) -> Sama seperti windowed() sebelumnya namun hasil collection di transform
 */

fun main() {
    val range = (1..5).toList()

    //* Mengambil element sebanyak 3, lalu akan bergeser 1 setiap selesai, jumlah yang diambil harus 3 jika tidak maka tidak diambil
    println(range.windowed(3, 1, false))

    // * mengambil element sebanyak 3, lalu akan berbeger 1 setiap selesai, jumlah yang diambil harus 3 jika tidak maka tidak akan ditampilkan, hitung element yang berhasil diambil lalu tampilkan panjang tiap list
    println(range.windowed(3, 1, false) { it.size })

    //* Mengambil element sebanyak 3, lalu akan bergeser 1 setiap selesai, jumlah yang diambil tidak harus 3 atau sampai mencapai batas range
    println(range.windowed(3, 1, true))

   //* Mengambil element sebanyak 3, lalu akan bergeser 1 setiap selesai, jumlah yang diambil tidak harus 3 atau sampai mencapai batas range, hitung element yang berhasil diambil lalu tampilkan panjang tiap list
    println(range.windowed(3, 1, true) { it.size })

    println(range.windowed(3, 2, false))
    println(range.windowed(3, 2, true))
}