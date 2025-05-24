package OOP

open class ParentClass {
    val x = 10
}

class ChildClass: ParentClass(){
    fun myFunction(){
        println(x)
    }
}

fun main() {
    val myObj = ChildClass()
    myObj.myFunction()
}