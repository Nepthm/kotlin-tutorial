package Fundamental.Function

fun main(args: Array<String>) {
    // * Mirip dengan lambda namun masih menggunakan keyword fun
    // * digunakan untuk function yang lebih kompleks dibanding lambda
    fun hello(name:String, transformer:(String)->String):String{
        val nameTransform = transformer(name);
        return "Helo $nameTransform";
    }

    val anonymousUpper = fun(value:String) : String{
        if(value.isBlank()){
            return "kosong"
        }else{
            return value.uppercase()
        }
    }

    // * Anonymous parameter
    println(hello("Noval", anonymousUpper))
    println(hello("", anonymousUpper))
    println(hello("NEPTSSS", fun(value:String):String{
        return value.lowercase();
    }))

}