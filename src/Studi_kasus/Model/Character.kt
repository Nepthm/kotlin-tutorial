package Studi_kasus.Model

class Player(val name: String, var health: Int, var level: Int = 1, val weapon: Weapon, val armor: Armor) {

    infix fun attack(enemy: Player) {
        val attackPower: Int = weapon.attackPower
        println("${this.name} attacking ${enemy.name} with power $attackPower")
        enemy.defend(attackPower)
        if (enemy.health < 0) {
            println("${this.name} LEVEL UP!!!")
            level++
        }
    }

    fun defend(attack: Int) {
        val damage = if (attack > this.armor.defendPower) {
            attack - this.armor.defendPower
        } else {
            0
        }

        val defendPower: Int = armor.defendPower - damage
        println("${this.name} defence from attack with power $damage")
        val status: String = if (defendPower < 0) {
            "Armor break"
        } else {
            "defence power $defendPower"
        }
        println(status)
        this.health -= damage


    }

    fun showCharacter() {
        println("Name : ${this.name}")
        println("Health : ${if (this.health <= 0) 0 else this.health}")
        println("Level : ${this.level}")
    }


}