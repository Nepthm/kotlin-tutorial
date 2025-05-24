package Studi_kasus

import Studi_kasus.Model.Armor
import Studi_kasus.Model.Player
import Studi_kasus.Model.Weapon

fun main(args: Array<String>) {
    val weapon1 = Weapon("Katana", 1000)
    val armor1 = Armor("Antiquiras", 7)

    val weapon2 = Weapon("SMG", 13)
    val armor2 = Armor("loongNight Jacket", 16)

    val chara1 = Player("Neptsss", 100, 1, weapon1, armor1)
    val chara2 = Player("Algo", 100, 1, weapon2, armor2)

    chara1 attack chara2
    chara2 attack chara1

    chara1.showCharacter()
    chara2.showCharacter()

}