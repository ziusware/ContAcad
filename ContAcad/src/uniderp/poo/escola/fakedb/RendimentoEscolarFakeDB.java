package uniderp.poo.escola.fakedb;

import java.util.ArrayList;
import java.util.Random;

import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.dominio.NotaTrabalho;
import uniderp.poo.escola.dominio.RendimentoEscolar;
import uniderp.poo.escola.dominio.Turma;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB<RendimentoEscolar>{

    @Override
    protected void CarregarDados() {
        AlunoFakeDB alnFakeDB = new AlunoFakeDB();
        ArrayList<Aluno> aluno = alnFakeDB.getTabela();
        TurmaFakeDB trmFakeDB = new TurmaFakeDB();
        ArrayList<Turma> turma = trmFakeDB.getTabela();
        NotaTrabalhoFakeDB ntTrabFakeDB = new NotaTrabalhoFakeDB();
        ArrayList<NotaTrabalho> notaTrabalhos = ntTrabFakeDB.getTabela();
        
        this.tabela.add(new RendimentoEscolar(1, aluno.get(0), turma.get(0), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(0)));
        this.tabela.add(new RendimentoEscolar(2, aluno.get(1), turma.get(0), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(0)));
        this.tabela.add(new RendimentoEscolar(3, aluno.get(2), turma.get(1), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(1)));
        this.tabela.add(new RendimentoEscolar(4, aluno.get(3), turma.get(1), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(1)));
        this.tabela.add(new RendimentoEscolar(5, aluno.get(4), turma.get(2), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(2)));
        this.tabela.add(new RendimentoEscolar(6, aluno.get(5), turma.get(2), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(2)));
        this.tabela.add(new RendimentoEscolar(7, aluno.get(6), turma.get(3), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(3)));
        this.tabela.add(new RendimentoEscolar(8, aluno.get(7), turma.get(3), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(3)));
        this.tabela.add(new RendimentoEscolar(9, aluno.get(8), turma.get(4), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(4)));
        this.tabela.add(new RendimentoEscolar(10, aluno.get(9), turma.get(4), getRandomNumber(), getRandomNumber(),notaTrabalhos.get(4)));
        this.tabela.add(new RendimentoEscolar(11, aluno.get(10), turma.get(5), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(5)));
        this.tabela.add(new RendimentoEscolar(12, aluno.get(11), turma.get(5), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(5)));
        this.tabela.add(new RendimentoEscolar(13, aluno.get(12), turma.get(6), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(6)));
        this.tabela.add(new RendimentoEscolar(14, aluno.get(13), turma.get(6), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(6)));
        this.tabela.add(new RendimentoEscolar(15, aluno.get(14), turma.get(7), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(7)));
        this.tabela.add(new RendimentoEscolar(16, aluno.get(15), turma.get(7), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(7)));
        this.tabela.add(new RendimentoEscolar(17, aluno.get(16), turma.get(8), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(8)));
        this.tabela.add(new RendimentoEscolar(18, aluno.get(17), turma.get(8), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(8)));
        this.tabela.add(new RendimentoEscolar(19, aluno.get(18), turma.get(9), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(9)));
        this.tabela.add(new RendimentoEscolar(20, aluno.get(19), turma.get(9), getRandomNumber(), getRandomNumber(), notaTrabalhos.get(9)));
    }

    private double getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(10);
    }

    public RendimentoEscolarFakeDB(){
        super();
    }

    private ArrayList<Integer> NotasAleatorios(){
        Random rand = new Random();
        ArrayList<Integer> notasTrabalho = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int nota = rand.nextInt(11);
            notasTrabalho.add(nota);
        }
        return notasTrabalho;
    }

    private double mediaTrabalhos(ArrayList<Integer> notas){
        int totalNotas = 0;
        for (int i = 0; i < notas.size(); i++) {
            totalNotas += notas.get(i);
        }

        double media = (double) totalNotas / notas.size();
        return media;
    }

    private double mediaGeral(ArrayList<Integer> notasTrabalhos, double notaP1, double notaP2){
        double totalNotasTrabalhos = 0;
        for (int i = 0; i < notasTrabalhos.size(); i++) {
            totalNotasTrabalhos += notasTrabalhos.get(i);
        }

        double notaGeral = totalNotasTrabalhos + notaP1 + notaP2;
        double media = (double) notaGeral / (notasTrabalhos.size() + 2);
        return media;
    }
    
}
