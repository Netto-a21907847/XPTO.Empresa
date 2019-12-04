package ULHT.A21907847;

import java.util.Date;

class Tarefa {
    private String descricao;
    private int idTarefa;
    protected String mes;
    private int nrHrs;
    private int valor;

    public Tarefa(String descricao, int idTarefa, String mes, int nrHrs, int valor) {
        this.descricao = descricao;
        this.idTarefa = idTarefa;
        this.mes = mes;
        this.nrHrs = nrHrs;
        this.valor = valor;
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

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setNrHrs(int nrHrs) {
        this.nrHrs = nrHrs;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", idTarefa=" + idTarefa +
                ", mes='" + mes + '\'' +
                ", nrHrs=" + nrHrs +
                ", valor=" + valor +
                '}';
    }
}
