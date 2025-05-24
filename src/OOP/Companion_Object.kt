package OOP 
/*
 ? Companion Object
* Kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
* Secara otomatis akan menggunakan nama companion, atau bisa langsung diakses lewat nama class nya
*/

class APK(val name:String){
    companion object{
        fun showName(name:String) : String{
            return name.uppercase()
        }
    }
}

fun main(args: Array<String>) {
    println(APK.showName("Noval"))
    println(APK.Companion.showName("Noval"))
}