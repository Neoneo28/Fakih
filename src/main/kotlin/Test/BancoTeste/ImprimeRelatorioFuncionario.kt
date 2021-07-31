package Test.BancoTeste

import Test.Funcionario

class ImprimeRelatorioFuncionario {

    companion object {
        fun Imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}