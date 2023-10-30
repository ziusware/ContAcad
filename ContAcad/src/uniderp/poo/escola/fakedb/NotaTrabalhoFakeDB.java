package uniderp.poo.escola.fakedb;

import uniderp.poo.escola.dominio.NotaTrabalho;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new NotaTrabalho(1, "João", 1, "Trabalho de Matemática", 5));
        this.tabela.add(new NotaTrabalho(2, "Maria", 2, "Trabalho de Artes", 3));
        this.tabela.add(new NotaTrabalho(3, "Pedro", 3, "Trabalho de Informática", 7));
        this.tabela.add(new NotaTrabalho(4, "Ana", 4, "Trabalho de Geografia", 7.5));
        this.tabela.add(new NotaTrabalho(5, "Lucas", 5, "Trabalho de História", 6));
        this.tabela.add(new NotaTrabalho(6, "Carla", 6, "Trabalho de Ciências", 8));
        this.tabela.add(new NotaTrabalho(7, "Mariana", 7, "Trabalho de Inglês", 4));
        this.tabela.add(new NotaTrabalho(8, "Gustavo", 8, "Trabalho de Educação Física", 9));
        this.tabela.add(new NotaTrabalho(9, "Beatriz", 9, "Trabalho de Química", 6.5));
        this.tabela.add(new NotaTrabalho(10, "Ricardo", 10, "Trabalho de Matemática", 8.5));
        this.tabela.add(new NotaTrabalho(11, "Larissa", 11, "Trabalho de Artes", 4.5));
        this.tabela.add(new NotaTrabalho(12, "Felipe", 12, "Trabalho de Informática", 7.2));
        this.tabela.add(new NotaTrabalho(13, "Isabela", 13, "Trabalho de Geografia", 6));
        this.tabela.add(new NotaTrabalho(14, "Thiago", 14, "Trabalho de História", 8.3));
        this.tabela.add(new NotaTrabalho(15, "Laura", 15, "Trabalho de Ciências", 5.7));
        this.tabela.add(new NotaTrabalho(16, "Gabriel", 16, "Trabalho de Inglês", 7.8));
        this.tabela.add(new NotaTrabalho(17, "Camila", 17, "Trabalho de Educação Física", 6.2));
        this.tabela.add(new NotaTrabalho(18, "Rafael", 18, "Trabalho de Química", 8.9));
        this.tabela.add(new NotaTrabalho(19, "Sofia", 19, "Trabalho de Matemática", 7.4));
        this.tabela.add(new NotaTrabalho(20, "Daniel", 20, "Trabalho de Artes", 4.2));
    }
    
}
