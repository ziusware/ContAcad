package uniderp.poo.escola.dominio;

public class Trabalho extends PossuiDisciplina implements IImpressao{
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Trabalho(int codigo, String disciplina, int codDisciplina, String descricao) {
        super(codigo, disciplina, codDisciplina);
        this.descricao = descricao;
    }

    @Override
    public void Imprimir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Descrição: " + this.descricao);        
    }

    
    
}
