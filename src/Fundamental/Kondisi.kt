package Fundamental

fun main() {
    // * if
    val x = 10;
    val y = 2;
    if(x > y){
        print("$x lebih besar dari $y")
    }

    // * if else
    if (x > y){
        print("$x lebih besar dari $y")
    }else{
        print("$x lebih kecil datri $y")
    }

    // * if else if
    if (x > y){
        print("$x lebih besar dari $y")
    }else if (y > x){
        print("$x lebih kecil datri $y")
    }else{
        print("$x sama dengan $y")
    }

    // * if..else Expressions
    // * Di kotlin kita bisa menggunakan if sebagai ekspresi, namun harus disertakan else
    val time = 8
    val greeting = if(time < 10){
        "Selamat pagi"
    }else{
        "selamat siang"
    }
    println(greeting);

    // * ternary
    var salam = if(time > 10) "Selamat siang" else "Selamat pagi"
    println(salam);

}