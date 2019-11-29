package ULHT.A21907847;

import java.util.ArrayList;
import java.util.List;

abstract class FuncionarioComTarefas extends Funcionario {
    protected List<Tarefa> listaTarefas;

    public FuncionarioComTarefas(String nome, String apelido, int idFuncionario, int nif, int salarioBase) {
        super(nome, apelido, idFuncionario, nif, salarioBase);
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
        if (listaTarefas.contains(tarefa)) {
            listaTarefas.remove(tarefa);
        }
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

    abstract String relatorioMensal(String mes);

}
