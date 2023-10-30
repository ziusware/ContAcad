package uniderp.poo.escola.dominio;

public class RendimentoEscolar extends PossuiAluno implements IImpressao{
    
    private String turma;
    private double notaP1;
    private double notaP2;
    private double trabalhos;
    private double media;

    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public String getTurmas() {
        return turma;
    }
    public void setTurmas(String turmas) {
        this.turma = turmas;
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
    public double getTrabalhos() {
        return trabalhos;
    }
    public void setTrabalhos(int trabalhos) {
        this.trabalhos = trabalhos;
    }


    public RendimentoEscolar(int codigo, String aluno, int codAluno, String turma, double notaP1, double notaP2,
            double trabalhos, double media) {
        super(codigo, aluno, codAluno);
        this.turma = turma;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.trabalhos = trabalhos;
        this.media = media;
    }
    @Override
    public void Imprimir() {
        System.out.println("Aluno: " + this.aluno);
        System.out.println("Turma: " + this.turma);
        System.out.println("Nota P1: " + this.notaP1);
        System.out.println("Nota P2: " + this.notaP2);
        System.out.println("Trabalhos: " + this.trabalhos);
        System.out.println("Media Geral: " + this.media);
    }

    

    
}
