package Test.BancoTeste

import Test.Analista
import Test.Funcionario
import Test.Gerente
import Test.Pessoa
import java.math.BigDecimal

fun main() {
    val Maria = Gerente("Maria Rodriguez", "548.666.584-45",  5000.0)

    ImprimeRelatorioFuncionario.Imprime(Maria)
}

