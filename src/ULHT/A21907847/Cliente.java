package ULHT.A21907847;

import java.util.ArrayList;
import java.util.List;

abstract class Cliente {

    private String nome;
    private int contactoTelefonico;
    private int nif;
    protected List<Tarefa> servicosContratados;

    public Cliente(String nome, int contactoTelefonico, int nif) {
        this.nome = nome;
        this.contactoTelefonico = contactoTelefonico;
        this.nif = nif;
        servicosContratados = new ArrayList<>();
    }

    public void addServico(Tarefa tarefa) {
        servicosContratados.add(tarefa);
    }

    public void removeServico(Tarefa tarefa) {
        servicosContratados.remove(tarefa);
    }

    public String getNome() {
        return nome;
    }

    public int getContactoTelefonico() {
        return contactoTelefonico;
    }

    public int getNif() {
        return nif;
    }

    public int somaValorDasTarefas (){
        int result = 0;
        for (Tarefa tarefaPer: servicosContratados){
            result += tarefaPer.getValor();
        }
        return result;
    }

    public String relatorioCliente() {
        return "** Nome: " + this.nome + " Nr.Tlm: " + this.contactoTelefonico + " Nif: " + this.nif + " **";
    }


}
