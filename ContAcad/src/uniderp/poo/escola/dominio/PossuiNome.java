package uniderp.poo.escola.dominio;

public abstract class PossuiNome extends Identificador{
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PossuiNome(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
    }

}
