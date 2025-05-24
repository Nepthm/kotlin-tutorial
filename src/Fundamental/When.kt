package Fundamental

fun main() {
    // * when mirip dengan switch pada java
    val day = 4;

    val result = when(day){
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jum'at"
        6 -> "Sabtu"
        7-> "Minggu"
        else -> "Invalid day" //-> wajib diotambahkan layaknya default pada switch
    }

    println(result);
}