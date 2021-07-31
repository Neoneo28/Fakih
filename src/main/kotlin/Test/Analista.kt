package Test

class Analista(
    Nome: String,
    CPF: String,
    Salario: Double
) : Funcionario(Nome, CPF, Salario) {
    override fun calculoAuxilio() = Salario * 0.1
}