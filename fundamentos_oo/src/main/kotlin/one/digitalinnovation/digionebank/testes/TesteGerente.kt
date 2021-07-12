package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Logavel

fun main() {

    val adriano = Gerente("Adriano Martins", "123.456.789-01", 10000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(adriano)

    TesteAutenticacao().autentica(adriano)
}
