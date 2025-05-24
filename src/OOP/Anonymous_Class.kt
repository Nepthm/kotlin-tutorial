package OOP

/**
 * Membuat Object dari class yang belum lengkap ( interface, abstract )
 */

interface Action {
    fun action()
}

fun fireAction(action:Action){
    action.action()
}

fun main() {

    // * menggunakan anonymous class
    fireAction(object : Action {
        override fun action() {
            println("Action 1")
        }
    })
    fireAction(object : Action {
        override fun action() {
            println("Action 2")
        }
    })
}