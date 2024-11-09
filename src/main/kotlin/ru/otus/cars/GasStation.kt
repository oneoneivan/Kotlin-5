package ru.otus.cars

class GasStation {

    fun addFuel(car: Car, liters: Int) {

        val mouth = car.tankMouth

        when (mouth) {
            is PetrolMouth -> mouth.fuelPetrol(liters)
            is LpgMouth -> mouth.fuelLpg(liters)
        }

    }

    fun safeAddFuel(car: Car, liters: Int) {
        try {
            addFuel(car, liters)
        } catch (e: NotImplementedError) {
            println("Взорвался бак")
        }
    }

}