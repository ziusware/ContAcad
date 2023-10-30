package uniderp.poo.escola.dominio;

import java.util.ArrayList;

public class Trabalho extends PossuiDisciplina implements IImpressao{
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

    public Trabalho(int codigo, Disciplina disciplina, String descricao) {
        super(codigo, disciplina);
        this.descricao = descricao;
    }

    @Override
    public void Imprimir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Descrição: " + this.descricao);        
    }

    
    
}
