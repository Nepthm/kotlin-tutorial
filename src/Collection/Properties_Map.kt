package Collection

/*
 ? PROPERTIES MAP
 * Merupakan cara untuk membuat properti yang dapat di akses seperti map
 * Dapat dilakukan ketika parsing data JSON
 */

private class Application(map: Map<String, Any>){
    val name : String by map
    val version : String by map
}

fun main() {
    val application = Application(mapOf(
        "name" to " Kotlin App",
        "version" to 1
    ))

    println(application.name)
}

