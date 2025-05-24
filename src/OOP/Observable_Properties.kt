package OOP

import kotlin.properties.Delegates

/*
 ? Observable Properties
 * Merupakan cara untuk mengetahui perubahan pada properties
 */
class Akun(description:String = " ") {
    var description : String by Delegates.observable(description){
        property, oldValue, newValue -> println("${property.name} is changed from $oldValue to $newValue")

    }

}

fun main() {
    val akun = Akun("Whale")
    akun.description = "F2P"
    akun.description = "P2W"
}