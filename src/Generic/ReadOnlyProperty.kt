package Generic

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/*
 ? READONLYPROPERTY INTERFACE
 * Di kotlin terdapat interface delegate proprty yang bisa digunakan dengan sifat readonly
 * Bisa digunakan sebagai delegate, sehingga sebelum data di kembalikan kita bisa melakukan sesuatu atau bahkan mengubah value si property
 */
class LogReadOnlyProperty(val data:String):ReadOnlyProperty<Any, String> {
    var counter = 0;
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
     println("Accsess property ${property.name} with value $data")
        counter++;
        // * Mengubah value
        return data.uppercase() + counter
    }
}

class NameWithLog(param:String){
    val name : String by LogReadOnlyProperty(param)
}

fun main() {
    val nameWithLog = NameWithLog("Neptune")
    println(nameWithLog.name)
    println(nameWithLog.name)
}