fun main() {

    val index = bodyMassIndex(1.78, 55)
    val verdict = when (index) {
        in 0.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.0..18.5 -> "Недостаточная (дефицит) масса тела"
        in 18.5..25.0 -> "Норма"
        in 25.0..30.0 -> "Избыточная масса тела (предожирение)"
        in 30.0..35.0 -> "Ожирение"
        in 35.0..40.0 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    println(verdict)
}

private fun bodyMassIndex(growth:Double, weight:Int): Double {
    return weight / (growth * growth)
}