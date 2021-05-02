package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("joao", 2000.0, "clt")
    val Pedro = Funcionario("Pedro", 1500.0,"pj")
    val maria = Funcionario("maria", 4000.0, "clt")

    val funcionarios = listOf(joao, Pedro, maria)

    print(funcionarios.find{it.nome == "maria"})
println("------------------------------------")
    funcionarios
        .groupBy { it.tipocontratacao}
        .forEach{ println(it)}
    println("------------------------------------")

}
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipocontratacao: String,

)

