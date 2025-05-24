package Studi_kasus.Model

class Weapon (val name :String, val attackPower :Int){
    fun showWeapon(){
        println("Weapon : ${this.name}, Attack power : ${this.attackPower}")
    }
}