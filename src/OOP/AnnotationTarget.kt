package OOP

/*
 ? ANNOTATION TARGET
 * Merupakan cara untuk menempatkan posisi annotation sesuai dengan kemauan kita
 * Biasanya digunakan untuk mengatasi target annotation kotlin yang tidak sesuai saat menggunakan framework java
 */

@Target(AnnotationTarget.VALUE_PARAMETER,AnnotationTarget.PROPERTY_GETTER,AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

class ExampleTarget(@field:Beta val firstName:String, @get:Beta val middleName:String, @param:Beta val lastName:String)

/*
 ? Bisa di lihat di decompile kotlin
 * @field:Beta -> menempatkan annotation di field
 * @get:Beta -> menempatkan annotation di get
 * @param:Beta -> menempatkan annotation di parameter
 */