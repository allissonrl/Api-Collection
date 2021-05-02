package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2000.0, 2210.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }
    println("maior salario: ${salarios.maxOrNull()}")
    println("menor salario: ${salarios.min()}()}")
    println("media salario: ${salarios.average()}")

    val salarioFilterQueue2500 = salarios.filter { it > 2500.0 }

    salarioFilterQueue2500.forEach {(println(it))}

    println("-----------------------------------------")
    println(salarios.find { it in 2000.0..5000.0 })

    println("-----------------------------------------")
    println(salarios.any { it in 2000.0..5000.0 })




}