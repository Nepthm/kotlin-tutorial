package Fundamental.Function

fun main(args: Array<String>) {
    //* kemampuan sebuah function berinteraksi dengan data disekitar dalam scope yang sama
    //! Sangat optional ( lebih baik tidak digunakan )
    var counter = 0;
    val lambdaCounter = {
        println("Lambda Increment")
        counter++;
    }

    val anonymousIncrement = fun(){
        println("anonymous function");
        counter++;
    }

    fun funcotinIncrement(){
        println("function increment")
        counter++
    }
    lambdaCounter()
    anonymousIncrement()
    funcotinIncrement();
    println("Counter = $counter")
}