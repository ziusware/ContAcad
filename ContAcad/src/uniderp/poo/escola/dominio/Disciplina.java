package uniderp.poo.escola.dominio;

public class Disciplina extends PossuiNome implements IImpressao{
    private String ementa;

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Disciplina(int codigo, String nome, String ementa) {
        super(codigo, nome);
        this.ementa = ementa;
    }

    @Override
    public void Imprimir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Ementa: " + this.ementa);
    }
   
}
