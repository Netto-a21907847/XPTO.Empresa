package ULHT.A21907847;

class Tarefeiro extends FuncionarioComTarefas {

    public Tarefeiro(String nome, String apelido, int idFuncionario, int nif) {
        super(nome, apelido, idFuncionario, nif);
    }

    public int calculaBonus() {
        int bonus = 0;
        if (nrTarefas() > 100 && nrHrsTotalDeTarefas() < 75) {
            bonus = (int) (0.25 * (nrTarefas() - 50));
        }
        return bonus;
    }

    @Override
    public int calculaSalario(String mes) {
        setSalarioBase(505);
        return getSalarioBase() + (2 * nrHrsTotalDeTarefas()) + calculaBonus();
    }

    @Override
    public String toString() {
        setSalarioBase(505);
        int result;
        if (listaTarefas.size() == 0) {
            result = salarioBase;
        } else {
            result = calculaSalario(listaTarefas.get(0).getMes());
        }
        return "> Nr.Funcionario: " + getIdFuncionario() + " | Nif: " + getNif() + " | " + getNome() + " " + getApelido() + " | Salario Total: " + result + " <";
    }


}
