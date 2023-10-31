package uniderp.poo.escola.fakedb;

import java.util.ArrayList;
import java.util.Random;

import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.dominio.NotaTrabalho;
import uniderp.poo.escola.dominio.Trabalho;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho>{

    @Override
    protected void CarregarDados() {        
        AlunoFakeDB alnFakeDB = new AlunoFakeDB();
        ArrayList<Aluno> aluno = alnFakeDB.getTabela();
        TrabalhoFakeDB trabFakeDB = new TrabalhoFakeDB();
        ArrayList<Trabalho> trabalhos = trabFakeDB.getTabela();
        
        this.tabela.add(new NotaTrabalho(1, aluno.get(0), trabalhos.get(0), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(11, aluno.get(0), trabalhos.get(1), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(12, aluno.get(0), trabalhos.get(2), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(13, aluno.get(0), trabalhos.get(3), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(2, aluno.get(1), trabalhos.get(4), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(21, aluno.get(1), trabalhos.get(5), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(22, aluno.get(1), trabalhos.get(6), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(23, aluno.get(1), trabalhos.get(7), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(3, aluno.get(2), trabalhos.get(8), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(31, aluno.get(2), trabalhos.get(9), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(32, aluno.get(2), trabalhos.get(0), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(33, aluno.get(2), trabalhos.get(1), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(4, aluno.get(3), trabalhos.get(2), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(41, aluno.get(3), trabalhos.get(3), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(42, aluno.get(3), trabalhos.get(4), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(43, aluno.get(3), trabalhos.get(5), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(5, aluno.get(4), trabalhos.get(6), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(51, aluno.get(4), trabalhos.get(7), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(52, aluno.get(4), trabalhos.get(8), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(53, aluno.get(4), trabalhos.get(9), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(6, aluno.get(5), trabalhos.get(0), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(61, aluno.get(5), trabalhos.get(1), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(62, aluno.get(5), trabalhos.get(2), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(63, aluno.get(5), trabalhos.get(3), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(7, aluno.get(6), trabalhos.get(4), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(71, aluno.get(6), trabalhos.get(5), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(72, aluno.get(6), trabalhos.get(6), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(73, aluno.get(6), trabalhos.get(7), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(8, aluno.get(7), trabalhos.get(8), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(81, aluno.get(7), trabalhos.get(9), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(82, aluno.get(7), trabalhos.get(0), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(83, aluno.get(7), trabalhos.get(1), getRandomNumber()));
        
        this.tabela.add(new NotaTrabalho(9, aluno.get(8), trabalhos.get(2), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(91, aluno.get(8), trabalhos.get(3), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(92, aluno.get(8), trabalhos.get(4), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(93, aluno.get(8), trabalhos.get(5), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(10, aluno.get(9), trabalhos.get(6), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(101, aluno.get(9), trabalhos.get(7), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(102, aluno.get(9), trabalhos.get(8), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(103, aluno.get(9), trabalhos.get(9), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(11, aluno.get(10),trabalhos.get(0), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(11, aluno.get(10),trabalhos.get(1), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(11, aluno.get(10),trabalhos.get(2), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(11, aluno.get(10),trabalhos.get(3), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(12, aluno.get(11),trabalhos.get(4), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(12, aluno.get(11),trabalhos.get(5), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(12, aluno.get(11),trabalhos.get(6), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(12, aluno.get(11),trabalhos.get(7), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(13, aluno.get(12),trabalhos.get(8), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(13, aluno.get(12),trabalhos.get(9), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(13, aluno.get(12),trabalhos.get(0), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(13, aluno.get(12),trabalhos.get(1), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(14, aluno.get(13),trabalhos.get(2), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(14, aluno.get(13),trabalhos.get(3), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(14, aluno.get(13),trabalhos.get(4), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(14, aluno.get(13),trabalhos.get(5), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(15, aluno.get(14),trabalhos.get(6), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(15, aluno.get(14),trabalhos.get(7), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(15, aluno.get(14),trabalhos.get(8), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(15, aluno.get(14),trabalhos.get(9), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(16, aluno.get(15),trabalhos.get(0), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(16, aluno.get(15),trabalhos.get(1), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(16, aluno.get(15),trabalhos.get(2), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(16, aluno.get(15),trabalhos.get(3), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(17, aluno.get(16),trabalhos.get(4), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(17, aluno.get(16),trabalhos.get(5), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(17, aluno.get(16),trabalhos.get(6), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(17, aluno.get(16),trabalhos.get(7), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(18, aluno.get(17),trabalhos.get(8), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(18, aluno.get(17),trabalhos.get(9), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(18, aluno.get(17),trabalhos.get(0), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(18, aluno.get(17),trabalhos.get(1), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(19, aluno.get(18),trabalhos.get(2), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(19, aluno.get(18),trabalhos.get(3), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(19, aluno.get(18),trabalhos.get(4), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(19, aluno.get(18),trabalhos.get(5), getRandomNumber()));

        this.tabela.add(new NotaTrabalho(20, aluno.get(19),trabalhos.get(6), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(20, aluno.get(19),trabalhos.get(7), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(20, aluno.get(19),trabalhos.get(8), getRandomNumber()));
        this.tabela.add(new NotaTrabalho(20, aluno.get(19),trabalhos.get(9), getRandomNumber()));
    }
    
    private double getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(10);
    }

    public NotaTrabalhoFakeDB(){
        super();
    }
}
