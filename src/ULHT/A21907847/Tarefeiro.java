package ULHT.A21907847;

import java.util.ArrayList;
import java.util.List;

class Tarefeiro extends FuncionarioComTarefas {

    public Tarefeiro(String nome, String apelido, int idFuncionario, int nif, int salarioBase) {
        super(nome, apelido, idFuncionario, nif, salarioBase);
    }

    public int calculaBonus() {
        int bonus = 0;
        if (nrTarefas() > 100 && nrHrsTotalDeTarefas() < 75) {
            bonus = (int) (0.25 * (nrTarefas() - 50));
        }
        return bonus;
    }

    @Override
    int calculaSalario(String mes) {
        setSalarioBase(505);
        return getSalarioBase() + (2 * nrHrsTotalDeTarefas()) + calculaBonus();
    }

    @Override
    String relatorioMensal(String mes) {
        List<String> relatorio = new ArrayList<>();
        for (Tarefa tarefas : listaTarefas) {
            relatorio.add("Tarefa: " + tarefas.getDescricao() + " NrHrs" + tarefas.getNrHrs());
        }
        return "> " + getNome() + " " + getApelido() + "\n" + listaTarefas.get(0).getMes() + "\n" + relatorio;
    }

    @Override
    public String toString() {
        return "> Nr.Funcionario: " + getIdFuncionario() + " | " + getNif() + " | " + getNome() + " " + getApelido() + " < Salario Total:  " + calculaSalario(listaTarefas.get(0).getMes());
    }


}
