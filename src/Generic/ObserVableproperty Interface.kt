package Generic

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/*
 ? `ObserVableproperty Class`
 * Sebelumnya (readOnly & readWrite ) perlu mengatur value data secara manual
 * kadang kita hanya butuh melakukan sesuatu sebelum dan setelah datanya di ubah
 * Untuk kasus seperti ini, kita bisa menggunakan generic class ObservableProperty
 */
class LogObserVableProperty<T>(param:T) : ObservableProperty<T>(param) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true // * Bisa merubah nilai nya
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand:String, year:Int){
    var brand :String by  LogObserVableProperty(brand)
    var year : Int by LogObserVableProperty(year)
    // * Tanpa membuat class
    var owner :String by Delegates.notNull<String>() // * ReadWriteProperty yang nilai awal bisa null, namun error jika masih null

    // * Before change ( Tanpa membuat class )
    var description : String by Delegates.vetoable(""){property, oldValue, newValue ->
        println("Before change ${property.name} from $oldValue to $newValue")
        true
    }
    // * After change ( Tanpa membuat class )
    var other : String by Delegates.observable(""){property, oldValue, newValue ->
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

fun main() {
    var car = Car("Volvo",2020)
    car.brand = "BMW"
    println(car.brand)

    car.year = 2023
    println(car.year)
}