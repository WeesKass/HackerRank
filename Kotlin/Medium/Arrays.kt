import java.util.*
import kotlin.collections.*
import kotlin.text.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val number = scan.nextLine().trim().toInt()

    val array = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    for ( i in array.size-1 downTo 0) print("${array.get(i)} ")
}

