package OOP

/*
 ? Operator Overloading
 * Bisa membuat function dari operator yang sudah ada ( matematika, unary , dll )
 * Jika inign membuat operator overloading maka harus menambahkan keyword operator di depan function
 */
data class Fruit(val total : Int){
    operator fun plus (fruit:Fruit) : Fruit{
        return Fruit(this.total + this.total)
    }
}

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(400)
    val result = fruit1 + fruit2
    println(result)
}