package OOP
/*
 * Enum class
 * Merupakan representasi dari class yang sudah tetap nialinya
 * Biasanya enum class digunakan untuk jenis data yang sudah baku, seperti jenis kelamin, sll
 * Gunakna keyword enum untuk mendeklarasikan classnya
 * Tidak bisa membuat instance dari enum class namun bisa mendeklarasikan langsug object yang tersedia untuk enum class tersebut
*/

/*
 * Properties dan Function Enum Class
 * JIka properties nya di set menggunakan constructor, maka saat pembuatan object enum , wajib diisi, dan jika terdapat abstract function, wajib di override pada saat pembuatan object enum
*/

enum class Gender{
    MALE, FEMALE
}

enum class Status(val description: String){
    ACTIVE("Active"),
    INACTIVE("Inavtive");

    fun showDescription(){
        println(description)
    }
}

// ? Membuat Object dari enum class 
fun main(args: Array<String>) {
    val man = Gender.MALE
    val woman = Gender.FEMALE

    // * Menampilkan semua data enum class
     val allGenders : Array<Gender> =  Gender.values()

    // * Konversi 
    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
     println(allGenders)

    val active = Status.ACTIVE
    active.showDescription()

}