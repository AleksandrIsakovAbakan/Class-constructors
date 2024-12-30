class Car(val weight: Int, val speed: Int) {

    fun traffic() {
        if (speed > 0) println("Автомобиль движется")
    }

    fun stop() {
        if (speed == 0) println("Автомобиль стоит")
    }

    override fun toString(): String {
        return "Car(weight=$weight, speed=$speed)"
    }


}