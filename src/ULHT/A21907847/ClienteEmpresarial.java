package ULHT.A21907847;

class ClienteEmpresarial extends Cliente {
    private String responsavel;
    private int contactoResponsavel;

    public ClienteEmpresarial(String nome, int contactoTelefonico, int nif, String responsavel, int contactoResponsavel) {
        super(nome, contactoTelefonico, nif);
        this.responsavel = responsavel;
        this.contactoResponsavel = contactoResponsavel;
    }

    @Override
    public String relatorioCliente() {
        return "** Nome: " + getNome() + " Nr.Tlm: " + getContactoTelefonico() + " Nif: " + getNif() + " **\nResponsavel: " + this.responsavel + " Tlm: " + this.contactoResponsavel;
    }
}
