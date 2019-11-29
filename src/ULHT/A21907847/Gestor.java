package ULHT.A21907847;

import java.util.ArrayList;
import java.util.List;

class Gestor extends FuncionarioComTarefas {

    public Gestor(String nome, String apelido, int idFuncionario, int nif, int salarioBase) {
        super(nome, apelido, idFuncionario, nif, salarioBase);
    }

    @Override
    int calculaSalario(String mes) {
        return (int) (getSalarioBase() + (0.5 * nrTarefas()));
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
