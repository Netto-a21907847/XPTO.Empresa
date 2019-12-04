package ULHT.A21907847;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Geradores {

    public static List<Tarefa> geradorDeTarefas() {
        Random gerar = new Random();
        List<Tarefa> listaDeTarefas = new ArrayList<>();
        for (int x = 0; x < 100; x++) {
            listaDeTarefas.add(new Tarefa("TF", gerar.nextInt(100)+1, "Novembro", gerar.nextInt(15) + 1, gerar.nextInt(50) + 1));
        }
        return listaDeTarefas;
    }

}
