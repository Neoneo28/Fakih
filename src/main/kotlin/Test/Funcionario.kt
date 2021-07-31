package Test

import java.math.BigDecimal

class Funcionario(
    override val Nome: String,
    override val CPF: String,
    val Salario: BigDecimal
) : Pessoa(Nome, CPF) {
}