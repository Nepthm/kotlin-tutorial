package Studi_kasus.Model

class Armor (val name:String, val defendPower:Int){
    fun showArmor(){
        println("Armor : ${this.name}, Defend Power : ${this.defendPower}")
    }
}