package ULHT.A21907847;

import java.util.ArrayList;
import java.util.List;

class Empresa {
    private String nome;
    private List<Funcionario> listaFuncionarios;
    private List<Cliente> listaClientes;
    private List<Tarefa> listaTarefasServiços;

    public Empresa(String nome) {
        this.nome = nome;
        this.listaFuncionarios = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaTarefasServiços = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", listaFuncionarios=" + listaFuncionarios +
                ", listaClientes=" + listaClientes +
                ", listaTarefasServiços=" + listaTarefasServiços +
                '}';
    }
}
