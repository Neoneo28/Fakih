package Test

class Gerente(
    Nome: String,
    CPF: String,
    Salario: Double
) : Funcionario(Nome = Nome, CPF = CPF, Salario = Salario) {
    override fun calculoAuxilio(): Double = Salario * 0.4
}