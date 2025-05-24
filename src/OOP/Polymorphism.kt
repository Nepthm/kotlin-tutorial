package OOP

/*
 ? POLYMORPHISM
 * Kemampuan sebuah object berubah bentuk menjadi bentuk lain
 * Erat hubungannya dengan inheritance
*/

fun main() {
    var employee : Employee = Employee("Noval")
    employee.sayHello("Neptss")

    // * Dari employee berubah ke manager
    employee = manager("Neptune")
    employee.sayHello("Algo")

    employee = VicePresident("Nepthm")
    employee.sayHello("Algotzy")
}
