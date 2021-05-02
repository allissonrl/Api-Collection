package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "maria"
    nomes[1] = "joao"
    nomes[2] = "jose"

    for (nome in nomes){
        println(nome)
    }
    println("___________________________________________________")
    nomes.sort()
    nomes.forEach { println(it) }
println("-----------------------------------------------------")
    val nomes2 = arrayOf("Maria","Zaza", "Pedro")
    println("______________________________________________________")
    nomes2.sort()
    nomes.forEach { println(it) }
}