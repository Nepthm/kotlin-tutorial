package Generic

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/*
 ? READWRITEPROPERTY INTERFACE
 * Sama halnya dengan ReadOnlyProperty, namun bisa digunakan untuk variabel var (mutable)
 */
class StringLogReadWriteProperty(var data:String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
       println("You get data ${property.name} is $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("You set data ${property.name} from $data to $value")
        data = value
    }

}

class Person(param:String){
    var name : String by StringLogReadWriteProperty(param)
}

fun main() {
    val person = Person("Algo")
    println(person.name)
    person.name = "netsss"
    println(person.name)

}