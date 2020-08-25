package fail.sazz.AdminDaRaizQuadrada

import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Qual é o número?")
    val fancyScanner = Scanner(System.`in`)
    val fancyNumber = fancyScanner.nextFloat()
    val root = sqrt(fancyNumber)
    println("O valor é: $root")
}

