package ULHT.A21907847;

abstract class Funcionario {
    private String nome;
    private String apelido;
    private int IdFuncionario;
    private int nif;
    protected int salarioBase;

    public Funcionario(String nome, String apelido, int idFuncionario, int nif) {
        this.nome = nome;
        this.apelido = apelido;
        this.IdFuncionario = idFuncionario;
        this.nif = nif;
        this.salarioBase = 0;
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

    public int calculaSalario(String mes){
        return this.salarioBase;
    };

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
