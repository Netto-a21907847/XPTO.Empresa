package ULHT.A21907847;

class Gestor extends FuncionarioComTarefas {

    public Gestor(String nome, String apelido, int idFuncionario, int nif) {
        super(nome, apelido, idFuncionario, nif);
    }

    @Override
    public int calculaSalario(String mes) {
        return (int) (getSalarioBase() + (0.5 * nrTarefas()));
    }

    @Override
    public String toString() {
        int result;
        if (listaTarefas.size() == 0){
            result = salarioBase;
        } else {
            result = calculaSalario(listaTarefas.get(0).getMes());
        }
        return "> Nr.Funcionario: " + getIdFuncionario() + " | Nif: " + getNif() + " | " + getNome() + " " + getApelido() + " | Salario Total: " + result + " <";
    }

}
