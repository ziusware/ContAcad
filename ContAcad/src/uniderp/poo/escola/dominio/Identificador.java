package uniderp.poo.escola.dominio;

public abstract class Identificador {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Identificador(int codigo) {
        this.codigo = codigo;
    }
    
}
