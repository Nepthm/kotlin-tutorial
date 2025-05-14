package Fundamental.Function

fun main(args: Array<String>) {
    // * merupakan penanda
    // * dapat di integrasikan dengan break, continue, dan return

   loopI@ for(i in 1..10){
      loopJ@  for(j in 1..10){
            println("$i * $j = ${i * j}")
          if (j == 8){
              break@loopI // * -> akan mengehentikan loopI
          }
        }
    }
}