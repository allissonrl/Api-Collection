package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao", 2000.0, "clt")
    val Pedro = Funcionario("Pedro", 1500.0,"pj")
    val maria = Funcionario("maria", 4000.0, "clt")

    val Funcionario1 = setOf(joao, Pedro)
    val Funcionario2 = setOf(maria)

   val resultUnion = Funcionario1.union(Funcionario2)
    resultUnion.forEach{ println(it) }

    println("----------------------")
    val Funcionario3 = setOf(joao, Pedro, maria)
   val resultsubtract = Funcionario3.subtract(Funcionario2)
    resultUnion.forEach{ println(it) }
}