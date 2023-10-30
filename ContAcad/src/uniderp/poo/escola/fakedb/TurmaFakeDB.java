package uniderp.poo.escola.fakedb;

import uniderp.poo.escola.dominio.Turma;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Turma(1, "Artes", 1, "Carlos", 1));
        this.tabela.add(new Turma(2, "Português", 2, "Ana", 2));
        this.tabela.add(new Turma(3, "Geografia", 3, "Pedro", 3));
        this.tabela.add(new Turma(4, "Informática", 4, "Maria", 4));
        this.tabela.add(new Turma(5, "Matemática", 5, "Luísa", 5)); 
        this.tabela.add(new Turma(6, "História", 1, "Carlos", 1));
        this.tabela.add(new Turma(7, "Ciências", 2, "Ana", 2));
        this.tabela.add(new Turma(8, "Inglês", 3, "Pedro", 3));
        this.tabela.add(new Turma(9, "Educação Física", 4, "Maria", 4));
        this.tabela.add(new Turma(10, "Química", 5, "Luísa", 5));
    }

    
    
}
