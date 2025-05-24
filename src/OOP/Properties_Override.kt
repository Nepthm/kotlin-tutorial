package OOP

open class Shape{
    open val corner = -1
}
class Rectangle:Shape(){
    override val corner = 4
}

fun main() {
    val shape = Shape()
    println(shape.corner)
    val rectangle = Rectangle()
    println(rectangle.corner)
}