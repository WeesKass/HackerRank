//Kotlin 1.1

import java.io.*;
import java.util.*;

class Person constructor (age: Int) {
    private var initialAge: Int

    init {

        if (age >= 0) {
            this.initialAge = age
        } else {
            this.initialAge = 0
            println("Age is not valid, setting age to 0..")
        }
    }

        fun amIOld() {
            if (initialAge < 13) {
                println("You are young..")
            } else if (initialAge in 13..17) {
                println("You are teenager..")
            } else {
                println("You are old..")
            }
        }

        fun yearPasses() {
            initialAge++
        }
    }


// do not edit code below!!!

    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val T: Int = sc.nextInt()
        for (i in 1..T) {
            var age: Int = sc.nextInt()
            var p = Person(age)
            p.amIOld()
            for (j in 1..3) {
                p.yearPasses()
            }
            p.amIOld()
            println()
        }
        sc.close()
    }
