package OOP

// * Dapat menerima parameter apapun

// * is dan !is Operator
// ? is digunakan untuk melakukan pengecekan apakah sebuah data merupakan tipe data tertentu
// ? !is digunakan untuk melakukan pengecekan apakah sebuah data bukan merupakan tipe data tertentu

// ? Setelah melakukan pengecekan menggunakan is, maka secara otomatis tipe data yang di cek akan berubah menjadi tipe data yang di cek

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop ${any.name}")
    } else if (any is String) {
        println("Tipe data String : $any")
    } else {
        println(any)
    }
}

fun pakeWent(any: Any) {
    when(any){
        is Laptop -> println("Laptop ${any.name}")
        is HandPhone -> println("Handphone ${any.name}")
        else -> println(any)
    }
}

//* Konversi data menggunakan as ( memaksa konversi )
// ? Dapat di ubah menjadi aman dengan nullable casts, namun ketika tipe data gagal di ubah maka akan menghasilan null (as ? )
fun printString(any:Any){
    val value = any as String
    val valueNull = any as? String
    println(valueNull)
}



fun main() {
    printObject("String")
    printObject(1)
    printObject(Laptop("Lenovo"))
    pakeWent(Laptop("Asus"))
    printString("Ini String")
//  ! printString(1) -> Error karena memaksa konversi string

}