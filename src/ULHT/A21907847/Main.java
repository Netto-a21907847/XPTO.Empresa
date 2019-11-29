package ULHT.A21907847;


public class Main {

    public static void main(String[] args) {
        Empresa emp1 = new Empresa("XPTO");
        emp1.listaTarefasServicos = Geradores.geradorDeTarefas();
        System.out.println(emp1.listaTarefasServicos.size());
        System.out.println(emp1.getNome());
        Tarefa t1 = new Tarefa("Limpar Cabos", 13, "Novembro", 4, 1);
        emp1.addTarefas(t1);
        System.out.println(emp1.listaTarefasServicos.size());
        Funcionario g1 = new Gestor("Fernando", "Prass", 1111, 11111, 1000);
        Funcionario tf1 = new Tarefeiro("Jorge", "Mendonça", 2222, 22222, 700);
        Funcionario tf2 = new Tarefeiro("Paula", "Cristina", 2111, 21111, 400);
        Funcionario tec1 = new Tecnico("Jorge", "Valdivia", 5555, 55555, 2000);
        emp1.addFuncionario(g1);
        emp1.addFuncionario(tf1);
        emp1.addFuncionario(tf2);
        emp1.addFuncionario(tec1);
        Gestor g2 = new Gestor("Pedro", "Alves", 1222, 12222, 1300);
        emp1.addFuncionario(g2);
        System.out.println(emp1.listaFuncionarios.size());
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(tec1);
        System.out.println(tf1);
        // esta adicionando as tarefas com mais de 10 hrs para o Gestor G2, e as menores para o Gestor G1
        for (Tarefa listaDeTarefas : emp1.listaTarefasServicos){
            if (listaDeTarefas.getNrHrs() > 10){
                g2.listaTarefas.add(listaDeTarefas);
            } else {
                ((Gestor) g1).listaTarefas.add(listaDeTarefas);
            }
        }
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(((Gestor) g1).listaTarefas.size());
        System.out.println(g2.listaTarefas.size());
        System.out.println(emp1.listaTarefasServicos);


    }


}
