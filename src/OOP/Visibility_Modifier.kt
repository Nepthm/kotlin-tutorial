package OOP

/**
 * Merupakan cara untuk mengatur aksesibilitas dari class, dll
 *  public -> default, dapat di akses dari manapun
 *  private -> hanyd dapat di akses di tempat deklarasinya
 *  protected -> hanya dapat diakses di tempat deklarasi dan juga turunannya
 *  internal -> hanyua dapat di akses di module / project yang sama
 */
open class Teacher {
    private fun teach(){
        println("Teach")
    }
  protected open fun test(){
        print("testing")
    }
}

class SuperTeacher: Teacher() {
    public override fun test(){
        super.test()
    }
}

fun main(args: Array<String>) {
    val teacher = Teacher()
    val SuperTeacher = SuperTeacher()
    SuperTeacher.test()
   // ! teacher.teach() -> Error karena private

}