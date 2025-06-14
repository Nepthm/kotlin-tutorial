package Collection

/*
 ? SET
 * Adalah collection yang datanya harus unik dan tidak pasti berurut
 * saat ada data yang duplicate maka data hanya akan di simpan satu, data duplicate tidak akan di tambahkan ke dalam set
 * cocok yntuk menyimpan data yang memang unik
 * menggunakan hashCode() dan equals() untuk membandingkan apakah sebuah object sama atau tidak
 */

private class Person(val name:String){
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean = when (other) {
        is Person -> name == other.name;
        else -> false;
    }

    override fun toString(): String {
        return "Person with name $name"
    }
}

fun main() {
    val set: Set<Person> = setOf(Person("Razer"),Person("Fantech"),Person("Razer"))

    println(set.size)
    println(set.contains(Person("Razer")))

    for (person in set){
        println(person)
    }

    // ? Muttable set
    val setMutable : MutableSet<Person> = mutableSetOf()
    setMutable.add(Person("Natsu"))
    setMutable.add(Person("Lucy"))
    setMutable.add(Person("Natsu"))
    setMutable.add(Person("Gray"))

    for (person in setMutable){
        println(person)
    }

}