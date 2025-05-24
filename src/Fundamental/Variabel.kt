package Fundamental

fun main() {
    // Secara default kotlin dapat mengenali jenis tipe data yang digunakan tanpa menambahkan tipe data pada variabel
    // namun dapat juga menambahkan tipe data pada variabel
    var alamat : String = "Yogyakarta";
    println(alamat);
    // * var : merupakan variabel yang dapat diubah
    var name = "Neptss";
    name = "Neptune"
    print(name);

    // * val : variabel yang tidak dapat diubah
    val umur = 20;
    // ! umur = 21; -> error karena val tidak dapat berubah
    print(umur);

    // * Deklarasi
    // * Untuk deklarasi tipe data harus di sertakan ( dan jika ingin menambahakan nilai berarti gunakan var jangan val)
    var status : String;
    status = "Belum Menikah";
    println(status);
}