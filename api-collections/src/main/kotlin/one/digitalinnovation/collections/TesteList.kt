package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1250.0)
    val maria = Funcionario("Maria", 2000.0)
    val rodrigo = Funcionario("Rodrigo", 3000.0)

    val funcionarios = listOf(joao, maria, rodrigo)

    funcionarios.forEach { println(it) }
    println("-----------------------------")

    println(funcionarios.find { it.nome == "Maria" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}