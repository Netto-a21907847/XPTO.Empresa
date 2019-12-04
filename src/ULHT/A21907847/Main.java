package ULHT.A21907847;


import java.util.Date;

public class Main {


    public static void main(String[] args) {

        Empresa emp1 = new Empresa("XPTO");
        emp1.listaTarefasServicos = Geradores.geradorDeTarefas();
        System.out.println(emp1.listaTarefasServicos.size());
        System.out.println(emp1.getNome());
        Tarefa t1 = new Tarefa("Limpar Cabos", 13, "Novembro", 4, 1);
        emp1.addTarefas(t1);
        System.out.println(emp1.listaTarefasServicos.size());
        FuncionarioComTarefas g1 = new Gestor("Fernando", "Prass", 1111, 11111);
        FuncionarioComTarefas tf1 = new Tarefeiro("Jorge", "Mendonça", 2222, 22222);
        Tarefeiro tf2 = new Tarefeiro("Paula", "Cristina", 2111, 21111);
        Funcionario tec1 = new Tecnico("Jorge", "Valdivia", 5555, 55555);
        emp1.addFuncionario(g1);
        emp1.addFuncionario(tf1);
        emp1.addFuncionario(tf2);
        emp1.addFuncionario(tec1);
        FuncionarioComTarefas g2 = new Gestor("Pedro", "Alves", 1222, 12222);
        emp1.addFuncionario(g2);
        g1.setSalarioBase(1000);
        g2.setSalarioBase(2000);
        tec1.setSalarioBase(1500);
        System.out.println(emp1.listaFuncionarios.size());
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(tec1);
        System.out.println(tf1);
        System.out.println(tf2);
        // esta adicionando as tarefas com mais de 10 hrs para o Gestor G2, e as menores para o Gestor G1
        for (Tarefa listaDeTarefas : emp1.listaTarefasServicos) {
            if (listaDeTarefas.getNrHrs() > 10) {
                g2.listaTarefas.add(listaDeTarefas);
            } else {
                g1.listaTarefas.add(listaDeTarefas);
            }
        }
        // esta adicionando as tarefas para os tarefeiros onde 1 recebe 100 trabalhos e 75 hrs
        for (Tarefa listaDeTarefasRepetida : emp1.listaTarefasServicos) {
            for (Tarefa listaRepete : emp1.listaTarefasServicos) {
                if (tf2.listaTarefas.size() < 100 && tf2.nrHrsTotalDeTarefas() < 75 && listaRepete.getNrHrs() == 1) {
                    tf2.listaTarefas.add(listaRepete);
                } else {
                    tf1.listaTarefas.add(listaRepete);
                }
            }
        }

        System.out.println(tf2.listaTarefas.size());
        System.out.println("Tamanho da lista dos tarefeitos: tf1 / tf2");
        System.out.println(tf1.listaTarefas.size());
        System.out.println(tf2.listaTarefas.size());
        System.out.println(tf1);
        System.out.println(tf2);


        System.out.println("Tamanho da lista dos Gestores: g1 / g2");
        System.out.println(g1.nrTarefas());
        System.out.println(g2.nrTarefas());
        System.out.println(g1);
        System.out.println(g2);

        emp1.listaTarefasServicos.remove(t1);
        System.out.println(emp1.listaTarefasServicos.size());
        System.out.println();
        System.out.println("Relatorios");
        System.out.println(g1.relatorioMensal("Novembro"));
        System.out.println(g2.relatorioMensal("Novembro"));
        System.out.println(tf1.relatorioMensal("Novembro"));
        System.out.println(tf2.relatorioMensal("Novembro"));


        System.out.println();


    }


}
