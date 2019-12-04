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
        g1.relatorioMensal(g1.listaTarefas.get(0).getMes());

        emp1.listaTarefasServicos.remove(t1);
        System.out.println(emp1.listaTarefasServicos.size());
        System.out.println();
        System.out.println("Relatorios");
        System.out.println(g1.relatorioMensal("Novembro"));
        System.out.println(g2.relatorioMensal("Novembro"));
        System.out.println(tf1.relatorioMensal("Novembro"));
        System.out.println(tf2.relatorioMensal("Novembro"));
        System.out.println();

        Cliente c1 = new ClienteEmpresarial("Buck", 1234, 11111, "Paulo", 5565);
        Cliente c2 = new ClienteEmpresarial("Microsoft", 5477, 2222, "Netto", 123456);
        Cliente cc1 = new ClienteIndividual("Joao", 1234548, 557899);
        emp1.addCliente(c1);
        emp1.addCliente(c2);
        emp1.addCliente(cc1);
        // relatorio de clientes
        emp1.relatorioClientes();
        System.out.println();
        System.out.println("Agora relatorio de clientes com tarefas\n");
        // adicionar 10 tarefas a cada cliente
        for (Cliente clientesP : emp1.listaClientes) {
            int y = (int) (Math.random() * 20);
            for (int x = y; x < (y + 10); x++) {
                clientesP.addServico(emp1.listaTarefasServicos.get(x));
            }
        }
        c1.addServico(emp1.listaTarefasServicos.get(0));
        c1.addServico(emp1.listaTarefasServicos.get(1));
        c1.addServico(emp1.listaTarefasServicos.get(3));
        c1.addServico(emp1.listaTarefasServicos.get(40));
        c1.addServico(emp1.listaTarefasServicos.get(50));
        c2.addServico(emp1.listaTarefasServicos.get(33));
        c2.addServico(emp1.listaTarefasServicos.get(32));
        c2.addServico(emp1.listaTarefasServicos.get(3));
        c2.addServico(emp1.listaTarefasServicos.get(43));
        c2.addServico(emp1.listaTarefasServicos.get(35));
        cc1.addServico(emp1.listaTarefasServicos.get(3));
        cc1.addServico(emp1.listaTarefasServicos.get(0));
        cc1.addServico(emp1.listaTarefasServicos.get(1));
        cc1.addServico(emp1.listaTarefasServicos.get(2));



        emp1.relatorioClientesEcomendas();


    }


}
