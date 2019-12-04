package ULHT.A21907847;

import java.util.ArrayList;
import java.util.List;

abstract class FuncionarioComTarefas extends Funcionario {
    protected List<Tarefa> listaTarefas;

    public FuncionarioComTarefas(String nome, String apelido, int idFuncionario, int nif) {
        super(nome, apelido, idFuncionario, nif);
        this.listaTarefas = new ArrayList<>();
    }

    public void addTarefa(Tarefa tarefa) {
        if (listaTarefas.get(0).getMes() == tarefa.getMes()) {
            this.listaTarefas.add(tarefa);
        } else {
            System.out.println("Tarefas de mês diferente.");
        }
    }

    public void removeTarefa(Tarefa tarefa) {
        listaTarefas.remove(tarefa);
    }

    public void limparListaTarefas(List<Tarefa> listaTarefas) {
        for (Tarefa tarefas : listaTarefas) {
            listaTarefas.remove(tarefas);
        }
    }

    public int nrTarefas() {
        return listaTarefas.size();
    }

    public int nrHrsTotalDeTarefas() {
        int result = 0;
        for (Tarefa tarefas : listaTarefas) {
            result += tarefas.getNrHrs();
        }
        return result;
    }


    public String relatorioMensal(String mes) {
        List<String> relatorio = new ArrayList<>();
        for (Tarefa tarefas : listaTarefas) {
            relatorio.add("Tarefa: " + tarefas.getDescricao() + " NrHrs" + tarefas.getNrHrs());
        }
        return "> " + getNome() + " " + getApelido() + "\n" + listaTarefas.get(0).getMes() + "\nNrTarefas: " + nrTarefas() + " HrsTarefas: " + nrHrsTotalDeTarefas();
    }

}
