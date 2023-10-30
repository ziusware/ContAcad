package uniderp.poo.escola.fakedb;

import java.time.LocalDate;

import uniderp.poo.escola.dominio.Aluno;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Aluno(1, "João", LocalDate.of(1998, 12, 1), "joaozinho", "joao@pass", 4, 1, 1));
        this.tabela.add(new Aluno(2, "Maria", LocalDate.of(2000, 5, 15), "maria123", "password", 5, 1, 1));
        this.tabela.add(new Aluno(3, "Pedro", LocalDate.of(1998, 9, 7), "pedrinho", "p@ssw0rd", 3, 2, 2));
        this.tabela.add(new Aluno(4, "Ana", LocalDate.of(2002, 8, 12), "aninha", "abc123", 5,2, 2));
        this.tabela.add(new Aluno(5, "Lucas", LocalDate.of(1997, 3, 4), "lucas22", "pass1234", 4,3, 3));
        this.tabela.add(new Aluno(6, "Carla", LocalDate.of(2001, 11, 19), "carlinha", "ilovejava", 5, 3,3));
        this.tabela.add(new Aluno(7, "Mariana", LocalDate.of(1999, 6, 9), "mariana99", "mariapass", 4, 4,4));
        this.tabela.add(new Aluno(8, "Gustavo", LocalDate.of(2003, 3, 22), "gustavinho", "gus123", 3, 4, 4));
        this.tabela.add(new Aluno(9, "Beatriz", LocalDate.of(2001, 7, 14), "bia2001", "beatrizpass", 5, 5,5));
        this.tabela.add(new Aluno(10, "Ricardo", LocalDate.of(1996, 4, 30), "ricardo96", "rpass", 4, 5, 5)); 
        this.tabela.add(new Aluno(11, "Larissa", LocalDate.of(1999, 10, 25), "larissa99", "larissapass", 4, 6,6));
        this.tabela.add(new Aluno(12, "Felipe", LocalDate.of(2000, 8, 7), "felipe2000", "felipepass", 3, 6, 6));
        this.tabela.add(new Aluno(13, "Isabela", LocalDate.of(1997, 7, 18), "isabela97", "isabelapass", 5, 7, 7));
        this.tabela.add(new Aluno(14, "Thiago", LocalDate.of(2002, 2, 12), "thiago02", "thiagopass", 4, 7, 7));
        this.tabela.add(new Aluno(15, "Laura", LocalDate.of(1998, 6, 30), "laura98", "laurapass", 4, 8, 8));
        this.tabela.add(new Aluno(16, "Gabriel", LocalDate.of(2001, 4, 5), "gabriel01", "gabrielpass", 5, 8, 8));
        this.tabela.add(new Aluno(17, "Camila", LocalDate.of(1999, 3, 14), "camila99", "camilapass", 3, 9, 9));
        this.tabela.add(new Aluno(18, "Rafael", LocalDate.of(2003, 9, 21), "rafael03", "rafaelpass", 5, 9, 9));
        this.tabela.add(new Aluno(19, "Sofia", LocalDate.of(1997, 1, 7), "sofia97", "sofiapass", 4, 10, 10));
        this.tabela.add(new Aluno(20, "Daniel", LocalDate.of(2000, 11, 3), "daniel2000", "danielpass", 4, 10,10));        
    } 

    public AlunoFakeDB(){
        super();
    }
}