package ULHT.A21907847;

class Tecnico extends Funcionario {

    public Tecnico(String nome, String apelido, int idFuncionario, int nif, int salarioBase) {
        super(nome, apelido, idFuncionario, nif, salarioBase);
    }

    @Override
    int calculaSalario(String mes) {
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return "> Nr.Funcionario: " + getIdFuncionario() + " | " + getNif() + " | " + getNome() + " " + getApelido() + " < Salario Total:  " + getSalarioBase();
    }
}
