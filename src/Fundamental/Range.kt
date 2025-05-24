package Fundamental

fun main() {
    for (nums in 5..15){
        //! -> akan menampilkan angka 5 sampai 15
        println(nums);
    }

    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
}
}
