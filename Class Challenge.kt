package Conditionals

import java.util.*

fun main()
{
    val random: Int
    random = Random().nextInt(100) + 1

    when(random){
        in 1..10 -> println("random number is in the range of  1 -10")
        in 11..20 -> println("random number is in the range of  11 -20")
        in 21..30 -> println("random number is in the range of  21 -30")
        in 31..40 -> println("random number is in the range of  31 -40")
        in 41..50 -> println("random number is in the range of  41 -50")
        else -> println ("random number is not in the range of  1 -50")
    }

    println(random
    )

}
