package ULHT.A21907847;

class Tarefa {
    private String descricao;
    protected String mes;
    private int nrHrs;
    private int prioridade;

    public Tarefa(String descricao, String mes, int nrHrs, int prioridade) {
        this.descricao = descricao;
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
                "descricao='" + descricao + '\'' +
                ", mes='" + mes + '\'' +
                ", nrHrs=" + nrHrs +
                ", prioridade=" + prioridade +
                '}';
    }
}
