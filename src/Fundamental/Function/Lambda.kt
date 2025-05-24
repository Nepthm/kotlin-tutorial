package Fundamental.Function

fun main(args: Array<String>) {
    // * merupakan function yang tidak memiliki nama
    // * Dapat membuat function tanpa mendeksripsikan function atau tanpa menggunakan kata kunci fun
    // * tidak menggunakan 'return', secara default baris terakhir dari lambda adalah return value

    // * contoh
    // val lambdaName: (tipe parameter) -> return value = { parameter :Type -> body }

    val lambdaName: (String,String) -> String = { firstName:String,LastName:String ->
        val result = "$firstName $LastName";
        result;
    }

    val result = lambdaName("Noval","Putra")
    println(result)

    // * It
    // * Jika lambda hanya memiliki 1 parameter maka parameter tersebut bisa diakses dengan it atau bisa tidak mendeklarasikan variabel paramter
    // ! Hanya bisa jika parameter di lambda berjumlah 1
    val spillNama:(String) -> String = {
        "Hallo $it"
    }
    println(spillNama("Noval"))

    // * Method reference
    // * Merupakan cara lain untuk membuat lambda yang mengarah ke function lain
    // * contoh
    fun kapitalAja(value:String):String = value.uppercase();
    val userName: (String) -> String = ::kapitalAja
    val spillUserName = userName("Neptsss")
    println(spillUserName)
}
