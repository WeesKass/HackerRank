import java.util.*
import kotlin.math.round
import kotlin.text.*

fun solve(mealCost: Double, tipPercent: Int, taxPercent: Int): Unit {
    val totalCost = mealCost + ((mealCost * (tipPercent/100.0))) + ((mealCost * (taxPercent/100.0)))

    println(round(totalCost).toInt())

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val mealCost = scan.nextLine().trim().toDouble()

    val tipPercent = scan.nextLine().trim().toInt()

    val taxPercent = scan.nextLine().trim().toInt()

    solve(mealCost, tipPercent, taxPercent)
}
