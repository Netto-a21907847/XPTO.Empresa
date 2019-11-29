package ULHT.A21907847;

import java.util.ArrayList;
import java.util.List;

class Gestor extends FuncionarioComTarefas {

    public Gestor(String nome, String apelido, int idFuncionario, int nif) {
        super(nome, apelido, idFuncionario, nif);
        this.listaTarefas = new ArrayList<>();
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
        return "> " + getNome() + " " + getApelido() + "\n" + listaTarefas.get(0).getMes() + "\nNrTarefas: " + nrTarefas() + " HrsTarefas: " + nrHrsTotalDeTarefas();
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
