package Generic

/*
 ? TYPE Erasure
 * Proses pengecekan generic pada saat compile time dan menghiraukan pengecekan pada saat runtime
 * Type erasure menjadikan infortmasi generic yang kita buat akan hilang ketika kode program kita telah di compile
 * Compiler akan mengubah generic parameter type menjadi type Any (Object jika pada java )

 ! PROBLEM
 * Karena informasi generic hilang ketika sudah menjadi binary file maka konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak
 */

// ? Cek pada decompile
class Type_Erasure<T>(param:T) {
    private val data : T = param;
    fun getData() : T = data
}

fun main() {
    val data = Type_Erasure<String>("Noval")
    val name : String = data.getData();

    val dataNumber :Type_Erasure<Int> = data as Type_Erasure<Int> // * -> Konversi dari String ke Int
    val dataInt = dataNumber.getData() // ! Error karena data merupakan String dan di paksa convert ke Int
    println(data)
    println(dataInt)
    
}