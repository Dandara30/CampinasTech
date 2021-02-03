package basico.operadores

import java.util.*

fun main() {

   println("Huelton" ==  "Huelton")

    val d1 = Date( 0) // Kotlin memoria 78437438
    val d2 = Date( 0) // Kotlin memoria 45543343

    println(d1 === d2)

    println(3 != 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    // visualG (e) e (ou)

    val x : Boolean = true
    val y : Boolean = true
    val w : Boolean = x && y
    val z : Boolean = x  || y
    val a : Boolean = (x  xor y) xor z
    println("Booleano de z : "+z)
    println("Booleano de w : "+w)
    println("Booleano de a : "+a)

}