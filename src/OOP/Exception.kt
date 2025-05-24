package OOP

/*
 ? Exception
 * Merupakan cara untuk menangani error yang terjadi pada saat program berjalan
 * try-cath -> merupakan cara untuk menangani error yang terjadi
 * Multiple catch -> menangani beberapa error sekaligus
 * finally -> Block kode yang bisa di tambahkan di try-cath
 * Akan di eksekusi setelah try-cath, tidak peduli apakah error atau tidak
 */

// * membuat exception
class ValidationException(message: String) : Throwable(message)

fun validateSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is Blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateSayHello("Putra")
        validateSayHello(" ") // ? ketika error, program akan berhenti di sini dan akan masuk ke catch
        println("Kode ini tidak akan di jalankan ketika kode di atas error")
    } catch (error: ValidationException) {
        println("Error : ${error.message}")
    } catch (error: NullPointerException) { // * Akan di tangkap jika jenis errornya NullPointerException
        println("Error : ${error.message}")
    }finally {
        println("Akan selalu di eksekusi walapun error")
    }
}