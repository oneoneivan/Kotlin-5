package ru.otus.cars

/**
 * Следит за машиной
 */
interface CarOutput {
    /**
     * Скажи текущую скорость
     */
    fun getCurrentSpeed(): Int

    /**
     * уровень топлива
     */
    fun getFuelContents(): String

}