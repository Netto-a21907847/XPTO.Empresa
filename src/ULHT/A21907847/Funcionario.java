package ULHT.A21907847;

abstract class Funcionario {
    private String nome;
    private String apelido;
    private int IdFuncionario;
    private int nif;
    private int salarioBase;

    public Funcionario(String nome, String apelido, int idFuncionario, int nif, int salarioBase) {
        this.nome = nome;
        this.apelido = apelido;
        this.IdFuncionario = idFuncionario;
        this.nif = nif;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getIdFuncionario() {
        return IdFuncionario;
    }

    public int getNif() {
        return nif;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    abstract int calculaSalario(String mes);

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", IdFuncionario=" + IdFuncionario +
                ", nif=" + nif +
                '}';
    }
}
