package Generic

/*
 ? Generic_Extension_Function
 */


class Data<T>(val data :T)

fun Data<String>.print(){
    val string = this.data
    println("String value is $string")
}

fun main() {
    val data1 : Data<Int> = Data(10)
    val data2 : Data<String> = Data("Neptune")

//  ! data1.print() -> Error karena integer sedangkan method print String
    data2.print()
}