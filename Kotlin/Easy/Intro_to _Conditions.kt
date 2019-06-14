import java.util.*
import kotlin.text.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val number = scan.nextLine().trim().toInt()

    if (number%2 == 0 && ( (number in  2..5) || number>20)){

        System.out.println("Not Weird");

    }else{
        System.out.println("Weird");

    }
}

