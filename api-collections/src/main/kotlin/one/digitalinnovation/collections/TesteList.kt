package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 3000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 1250.0, "CLT")

    val funcionarios = listOf(joao, maria, pedro)

    funcionarios.forEach { println(it) }
    println("-----------------------------")

    println(funcionarios.find { it.nome == "Maria" })
    println("-----------------------------")

    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("-----------------------------")

    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}