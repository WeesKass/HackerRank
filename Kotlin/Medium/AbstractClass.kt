import java.util.*


abstract class Book(title:String, author:String){

    abstract fun display()
}

// do not edit code above!!!

class MyBook (val title: String, val author: String, val price: Int) : Book(title, author) {

    override fun display() {
        println("Title: $title")
        println("Author: $author")
        println("Price: $price")
    }
}
// do not edit code below!!!

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val title:String = scan.nextLine()
    val author:String = scan.nextLine()
    val price:Int = scan.nextInt()

    scan.close()

    val b:Book = MyBook(title, author, price)
    b.display()
}

