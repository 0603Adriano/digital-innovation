package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal
import java.math.BigInteger

fun main() {

    val adriano = Analista("Adriano Martins", "123.456.789-01", 3800.0)

    ImprimeRelatorioFuncionario.imprime(adriano)

}