package uniderp.poo.escola.dominio;

public class NotaTrabalho extends PossuiAluno implements IImpressao{

    private String trabalho;
    private double nota;

    public String getTrabalho() {
        return trabalho;
    }
    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public NotaTrabalho(int codigo, String aluno, int codAluno, String trabalho, double nota) {
        super(codigo, aluno, codAluno);
        this.trabalho = trabalho;
        this.nota = nota;
    }
    
    @Override
    public void Imprimir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Alunos : " + this.aluno);
        System.out.println("Trabalhos: " + this.trabalho);
        System.out.println("Nota: " + this.nota);       
    }

    

    
}
