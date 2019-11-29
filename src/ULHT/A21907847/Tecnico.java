package ULHT.A21907847;

class Tecnico extends Funcionario {

    public Tecnico(String nome, String apelido, int idFuncionario, int nif) {
        super(nome, apelido, idFuncionario, nif);
    }

    @Override
    int calculaSalario(String mes) {
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return "> Nr.Funcionario: " + getIdFuncionario() + " | Nif: " + getNif() + " | " + getNome() + " " + getApelido() + " | Salario Total: " + getSalarioBase() + " <";
    }
}
