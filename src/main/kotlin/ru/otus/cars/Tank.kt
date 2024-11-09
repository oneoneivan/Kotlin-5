package ru.otus.cars

interface Tank {

    var fuelValue: Int

    fun getContents(): String

    fun receiveFuel(liters: Int) {
        fuelValue += liters
    }

}

enum class FuelType(val type: String) {
    PETROL("Бензин"),
    LPG("Газ")
}

abstract class TankMouth(val fuelType: FuelType) : Tank {

    override var fuelValue: Int = 0
    private var mouthOpen = false

    override fun getContents(): String {
        return "Тип топлива: ${fuelType.type}, уровень $fuelValue"
    }

    fun open() {
        mouthOpen = true

    }

    fun close() {
        mouthOpen = false
    }
}

class PetrolMouth : TankMouth(FuelType.PETROL) {

    fun fuelPetrol(liters: Int) {
        open()
        println("Заправка начинается")
        receiveFuel(liters)
        println("Заправка окончена")
        close()
    }

}

class LpgMouth : TankMouth(FuelType.LPG) {

    fun fuelLpg(liters: Int) {
        open()
        println("Начинается заправка")
        receiveFuel(liters)
        println("Заправка окончена")
        close()
    }

}

