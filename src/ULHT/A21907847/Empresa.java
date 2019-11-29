package ULHT.A21907847;

import java.util.ArrayList;
import java.util.List;

class Empresa {
    private String nome;
    public List<Funcionario> listaFuncionarios;
    public List<Cliente> listaClientes;
    public List<Tarefa> listaTarefasServicos;

    public Empresa(String nome) {
        this.nome = nome;
        this.listaFuncionarios = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaTarefasServicos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.listaFuncionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario) {
        listaFuncionarios.remove(funcionario);

    }

    public void addCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public void addTarefas(Tarefa tarefa) {
        this.listaTarefasServicos.add(tarefa);
    }

    public void removeTarefas(Tarefa tarefa) {
        listaTarefasServicos.remove(tarefa);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", listaFuncionarios=" + listaFuncionarios +
                ", listaClientes=" + listaClientes +
                ", listaTarefasServiços=" + listaTarefasServicos +
                '}';
    }
}
