package Fundamental

fun main() {
    val mobil = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    // * mengakses element dalam array
    print(mobil[0])

    // * mengganti elemen array
    mobil[0] = "Opel"
    println(mobil[0])

    // * Menampilkan panjang array
    println(mobil.size)

    //* Cek apakah elemen tersebut ada "..."
    if("BMW" in mobil){
        println("Ada")
    }else{
        println("Tidak ada")
    }

    // * Looping untuk menampilkan elemen pada array
    for (x in mobil){
        println(x)
    }
}
