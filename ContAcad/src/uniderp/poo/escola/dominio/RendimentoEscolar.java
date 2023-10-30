package uniderp.poo.escola.dominio;

import uniderp.poo.escola.repositorio.NotaTrabalhoRepositorio;
import uniderp.poo.escola.repositorio.RendimentoEscolarRepositorio;
import uniderp.poo.escola.servico.NotaTrabalhoServico;

public class RendimentoEscolar extends PossuiAluno implements IImpressao{
    
    private Turma turma;
    private double notaP1;
    private double notaP2;
    private NotaTrabalho trabalhos;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }

    public double getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
    }

    public NotaTrabalho getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(NotaTrabalho trabalhos) {
        this.trabalhos = trabalhos;
    }

    public RendimentoEscolar(int codigo, Aluno aluno, Turma turma, double notaP1, double notaP2,
            NotaTrabalho trabalhos) {
        super(codigo, aluno);
        this.turma = turma;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.trabalhos = trabalhos;
    }


    @Override
    public void Imprimir() {
        RendimentoEscolarRepositorio repoRendimento = new RendimentoEscolarRepositorio();
        for (RendimentoEscolar rendimento : repoRendimento.ReadAll()){
            System.out.println("---------------------------------");
            System.out.println("Aluno: " + rendimento.getAluno().getNome());
            System.out.println("Turma: " + rendimento.getTurma().getDisciplina().getNome());
            System.out.println("Nota P1: " + rendimento.getNotaP1());
            System.out.println("Nota P2: " + rendimento.getNotaP2());
            System.out.println("Nota Trabalhos");
            System.out.println(rendimento.getTrabalhos().getTrabalhos().getDisciplina().getNome() + ": " + rendimento.getTrabalhos().getNota());
        }
    }

    
}
