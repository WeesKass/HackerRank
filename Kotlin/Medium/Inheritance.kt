import java.util.*
import kotlin.io.*

open class Person(private val firstName:String, private val lastName:String, private val identification:Int){


    fun printPerson() {
        println("Name: $lastName, $firstName\nID: $identification")
    }
}

// do not edit code above!!!

class Student constructor(firstName:String, lastName:String, id:Int, val testScores:IntArray):Person(firstName, lastName, id) {
    

    fun calculate():String{
        var answer = ""
        var result = testScores.sum()/testScores.size
        if (result in 90..100){
            answer = "O"
        }else if (result in 80..89){
            answer = "E"
        }else if (result in 70..79){
            answer = "A"
        }else if (result in 55..69){
            answer = "P"
        }else if (result in 40..45){
            answer = "D"
        }else{
            answer = "T"
        }
        return answer
    }
}

// do not edit code below!!!

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val firstName:String = scan.next()
    val lastName:String = scan.next()
    val id:Int = scan.nextInt()

    val numScores:Int = scan.nextInt()
    val testScores:IntArray = IntArray(numScores)

    for (i in 0..numScores-1) {
        testScores[i] = scan.nextInt()
    }

    scan.close()

    val s:Student = Student(firstName, lastName, id, testScores)
    s.printPerson()
    println("Grade: ${s.calculate()}")
}

