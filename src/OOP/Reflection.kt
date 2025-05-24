package OOP
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

/*
 ? REFLECTION
 *  Merupakan kemampuan melihat struktur aplikasi saat runtime atau berjalan
 *  Biasanya sangat berguna saat ingin membuat library atau fraework
 *  Untuk mengakses reflection class dari sebuah object, gunakan keywork ::class atau bisa langsung dari NamaClass::class
 */

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class NotBlank()

class CrateProductRequset(@NotBlank val id:String,@NotBlank val name:String,@NotBlank val price:Long)

class CreateKategoriRequest(val id:String, val name:String)

// * Cara manual untuk validasi
fun validateRequestProduct(request : CrateProductRequset){
    if(request.id == ""){
        throw ValidationException("id is blank")
    }
}

fun vlaidateRequest(request:Any){
    val clazz = request::class
    val properties = clazz.memberProperties

    for (property in properties){
        if(property.findAnnotation<NotBlank>() != null){
            val value = property.call(request) // * -> memanggil property yang sesuai dengan request (object)
            when(value){
                is String -> if ("" == value) throw ValidationException("${property.name} is blank")
            }
        }
    }
}

fun main() {
    val request = CrateProductRequset("", "Indomie", 1000)
    vlaidateRequest(request)
}




