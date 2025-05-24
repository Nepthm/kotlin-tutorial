package Fundamental

fun main() {
    // * Sama halnya dengan java String di kotlin juga merupakan objek yang dapat diakses dengan index
    var txt : String = "Hello world";
    println(txt.length)
    println(txt[0])

    // * Method pada string
    println(txt.uppercase())

    // * cek apakah string tersebut tama dengan txt2 -> akan mengambalikan nilai 0 jika sama
    var txt2 : String = "Hello world"
    print(txt.compareTo(txt2));

    // * mencari lokasi index dari string
    val txt3 : String = "Hallo saya di sini";
    println(txt3.indexOf("saya"));

    // * menggabungkan string
    println(txt.plus(txt3)); // -> bisa juga menggunakan +

    // String template / Interpolation
    val firstName = "Kusajishi"
    val lastName = "Yamamoto"
    println("My name is $firstName $lastName")

}
