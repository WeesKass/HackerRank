import java.util.*
import kotlin.text.*

fun main() {
    val scan = Scanner(System.`in`)
    val number = scan.nextLine().trim().toInt()

    for ( i in 1..10 ) println("$number * $i = ${number*i}")
}

