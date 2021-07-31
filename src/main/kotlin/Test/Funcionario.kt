package Test

import java.math.BigDecimal

abstract class Funcionario(
    Nome: String,
    CPF: String,
    val Salario: BigDecimal
) : Pessoa(Nome, CPF) {
    abstract fun calculoAuxilio();
}