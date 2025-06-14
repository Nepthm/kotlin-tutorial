package Collection

/*
 ? FOLD & REDUCE
 * operasi yang dilakukan pada element yang ada di collection secara iterasi sequential dan mengembalikan hasil
 * hasil dri fold dan reduce akan di gunakan untuk iterasi berikutnya

 ? OPERATION 1
 * reduce( (R,T) -> R) : R -> pada iterasi pertama , R adalah element pertama, T adalah element selanjutnya. Iterasi selanjutnya, R adalah hasil dari iterasi sebelumnya
 * fold( R, (R,T) -> R) : R -> Fold sama dengan reduce, yang membedakan adalah, fold memiliki inisial value R yang bisa kita masukkan secara manual

 ? OPERATION 2
 * reduceRight() & foldRight() -> Sama seperti reduce dan fold namun dimulai dari element terakhir
 * reduceIndexed & foldIndexed -> samna seperti reduce dan fold namun terdapat parameter index
 * reduceRightIndexed() & foldRightIndexed() -> sama seperti reduceIndexed dan foldIndexed namun dimulai dari element akhir
 */

fun main() {
    val numbers = (1..100).toList()
    val max = numbers.reduce { acc, i ->
//        println("acc -> "+acc)
//        println("i -> "+i)
        if (acc < i) i
        else acc
    }

    // * data pertama -> 0 ( initial)
    val sum = numbers.fold(0) {
        acc, i -> acc + i
    }

    println(max)
    println(sum)
}