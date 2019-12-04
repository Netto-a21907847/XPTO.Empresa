package ULHT.A21907847;

abstract class Cliente {

    private String nome;
    private int contactoTelefonico;
    private int nif;

    public Cliente(String nome, int contactoTelefonico, int nif) {
        this.nome = nome;
        this.contactoTelefonico = contactoTelefonico;
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public int getContactoTelefonico() {
        return contactoTelefonico;
    }

    public int getNif() {
        return nif;
    }

    public String relatorioCliente(){
        return "** Nome: " + this.nome + " Nr.Tlm: " + this.contactoTelefonico + " Nif: " + this.nif + " **";
    }
}
