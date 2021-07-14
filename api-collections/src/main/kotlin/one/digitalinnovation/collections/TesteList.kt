package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 3000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val rodrigo = Funcionario("Rodrigo", 1250.0, "CLT")

    val funcionarios = listOf(joao, maria, rodrigo)

    funcionarios.forEach { println(it) }
    println("-----------------------------")

    println(funcionarios.find { it.nome == "Maria" })
    println("-----------------------------")

    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("-----------------------------")

    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}