import kotlin.io.*
import  java.util.Scanner


fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val firstNumber: Int = 4
    val firrstDouble: Double = 4.0
    val firstString: String = "HackerRank "

    val secondNumber: Int = scan.nextInt()
    val secondDouble: Double = scan.nextDouble(); scan.nextLine()
    val secondString: String = scan.nextLine()


    println( firstNumber + secondNumber )
    println( firrstDouble + secondDouble )
    println( firstString + secondString )

}

