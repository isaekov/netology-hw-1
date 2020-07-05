fun main() {
    val amount = 200.56
    val total = 11_000.0
    val result = calculateFee(amount, total)
    println(result)
}

private fun calculateFee(amount: Double, total:Double, exclusive:Boolean = false): Double {
    val minimumAmount = 1_000
    val averageAmount = 10_000
    val maximumAmount = 50_000

    val percent = when {
        total > minimumAmount && total <= averageAmount -> {
            25
        }
        total > averageAmount && total <= maximumAmount -> {
            20
        }
        total > maximumAmount -> {
            15
        }
        else -> 30
    }

    return if (exclusive) amount * (percent - 5) / 100 else amount * percent / 100
}