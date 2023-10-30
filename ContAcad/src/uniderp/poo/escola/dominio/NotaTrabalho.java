package uniderp.poo.escola.dominio;

public class NotaTrabalho extends PossuiAluno implements IImpressao{

    private Trabalho trabalhos;
    private double nota;

   
    public Trabalho getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(Trabalho trabalhos) {
        this.trabalhos = trabalhos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public NotaTrabalho(int codigo, Aluno aluno, Trabalho trabalhos, double nota) {
        super(codigo, aluno);
        this.trabalhos = trabalhos;
        this.nota = nota;
    }



    @Override
    public void Imprimir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Alunos : " + this.aluno);
        System.out.println("Trabalhos: " + this.trabalhos);
        System.out.println("Nota: " + this.nota);       
    }
    

    
}
