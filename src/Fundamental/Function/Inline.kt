package Fundamental.Function


inline fun hello (name: () -> String) : String {
    return "Hello ${name()}"
}

inline fun spillName(firstName:()-> String, noinline  lastName:()-> String) :String{
    return "Hello ${firstName()} ${lastName()}"
}
fun main() {
    // * merupakan kemempuan kotlin yang mengubah Higher Order funciton menjadi inline function
    // * penggunaan High Order function akan berdampak terhasap performa saat aplikasi berjalan
    // * Dengan inline function code di dalam High order function akan di duplicate agar pada saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang

    // * sifatnya sama dengan tail recursive yang akan mengubah recursive menjadi looping dan inline funtion yang akan mengubah High order function menjadi function biasa

    // * contoh

    println(hello { "Noval" })

    for(i in 0..100){
//    println(hello { "Neptune" })
    println(spillName({ "Neptune" },{"Netpsss"}) )
    }

    // * hasil dapat di lihat di tools -> kotlin -> show kotlin bycode -> decompile
    // * disitu dapat terlihat bahwa inline function akan mengcopy code yang ada di dalam function ke tempat pemanggilan function
    // * hal ini akan menyebabkan aplikasi lebih cepat karena tidak perlu membuat object lambda berulang ulang


    // * Noinline
    // * saat menandai bahwa function adalah inlince maka secara otomatis semua parameter akan menjadi inline
    // * jika kita ingin menandai bahwa parameter tersebut tidak inline, maka kita bisa menambahkan noinline
}