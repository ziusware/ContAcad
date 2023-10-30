package uniderp.poo.escola.fakedb;

import uniderp.poo.escola.dominio.Disciplina;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Disciplina(1, "Artes", "Ementa de Artes"));
        this.tabela.add(new Disciplina(2, "Português", "Ementa de Português"));
        this.tabela.add(new Disciplina(3, "Geografia", "Ementa de Geografia"));
        this.tabela.add(new Disciplina(4, "Informática", "Ementa de Informática"));
        this.tabela.add(new Disciplina(5, "Matemática", "Ementa de Matemática"));
        this.tabela.add(new Disciplina(6, "História", "Ementa de História"));
        this.tabela.add(new Disciplina(7, "Ciências", "Ementa de Ciências"));
        this.tabela.add(new Disciplina(8, "Inglês", "Ementa de Inglês"));
        this.tabela.add(new Disciplina(9, "Educação Física", "Ementa de Educação Física"));
        this.tabela.add(new Disciplina(10, "Química", "Ementa de Química"));         
    }

    
    
}
