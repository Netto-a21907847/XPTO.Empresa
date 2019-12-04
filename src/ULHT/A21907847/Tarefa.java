package ULHT.A21907847;

import java.util.Date;

class Tarefa {
    private String descricao;
    private int idTarefa;
    protected String mes;
    private int nrHrs;
    private int prioridade;

    public Tarefa(String descricao, int idTarefa, String mes, int nrHrs, int prioridade) {
        this.descricao = descricao;
        this.idTarefa = idTarefa;
        this.mes = mes;
        this.nrHrs = nrHrs;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMes() {
        return mes;
    }

    public int getNrHrs() {
        return nrHrs;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setNrHrs(int nrHrs) {
        this.nrHrs = nrHrs;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "idTarefa=" + idTarefa +
                ", mes='" + mes + '\'' +
                ", nrHrs=" + nrHrs +
                '}';
    }
}
