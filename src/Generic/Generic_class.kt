package Generic

/*
 ? GENERIC
 * Kemampuan menambahkan parameter type saat membuat class atau function
 * Generic memungkinkan kita bisa mengubah ubah bentuk type sesuai dengan yang kita mau

 ? MANFAAT
 * Pengecekan ketikia proses kompilasi
 * Tidak perlu manual pengecekan tupe data dan konversi tipe data
 * Memudahkan untuk membuat kode program yang generic sehingga bisa digunakan oleh berbagai tipe data

 */

/*
 ? GENERIC TYPE
 * Merupakan class atau initerface yang memiliki parameter type
 * Tidak ada ketntuan dalam pembuatan generic paramater type, namun biasanya kebanyakan orang menggunakan 1 karakter sebagai generic parameter type
 * E -> Element ( Biasa digunakan di collection atau struktur data )
 * K -> key
 * N -> Number
 * T -> Type
 * V -> value
 */
class MyData<T, U>(val firstData: T, val secondData:U) {
    fun printData(){
        return println("Data is $firstData $secondData")
    }

    fun getData() : T{
        return firstData
    }

    fun getSecond() : U = secondData;
}

fun main() {
    val data1 : MyData<String, Int> = MyData<String, Int>("Noval",19)
    val data2 : MyData<String, Int> = MyData("Noval", 20)
    val data3 = MyData("Neptune", 10)
    val data4 : MyData<Int, String> = MyData<Int, String>(100, "Neptune")

    data1.printData()
    data2.printData()
    data3.printData()
}