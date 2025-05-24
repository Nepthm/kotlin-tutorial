package Fundamental.Function

fun main() {
    // ! Semakin banyak pemanggilan function, semakin banyak stack yang digunakan, artinya akan terjadi error stack overflow
    // * Di kotlin masalah ini bisa ditangani dengan tail recursive, berbeda dengan java yang sudah tidak bisa di tangani
    // * Tail recursive function merupakan teknik mengubah recursive fungtion menjadi looping biasa ketika dijalankan
    // ! Tidak semua recursive bisa secara otomatis dibuat menjadi tail recursive ( Ada syarat )
    // ? Syarat
    // * Tambahkan tailrec di functionnya
    // * Hanya boleh memanggil function dirinya sendiri tanpa operasi dengan data lain

    // * Contoh
    tailrec fun display(value:Int){
        println(value)
        if (value > 0){
            display(value - 1) //* 2 -> tidak boleh menambahkan operasi saat memanggil function
        }
    }
    // * contoh yang salah -> tidak akan diubah menajdi looping biasa karena tidak memnuhi syarat
//    tailrec fun factorialRecursive(value:Int) : Int{
//        return when(value){
//            1 -> 1
//            else -> value * factorialRecursive(value - 1) -> terdapat operasi data
//        }
//    }
    // * perbaikan
    tailrec fun factorialRecursive(value:Int, total:Int = 1) : Int{
        return when(value){
            1 -> total
            else -> factorialRecursive(value - 1,total * value)
        }
    }

}