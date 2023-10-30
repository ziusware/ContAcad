package uniderp.poo.escola.dominio;

public abstract class PossuiAluno extends Identificador{
    protected String aluno;
    protected int codAluno;

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getAlunos() {
        return aluno;
    }

    public void setAlunos(String aluno) {
        this.aluno = aluno;
    }

    public PossuiAluno(int codigo, String aluno, int codAluno) {
        super(codigo);
        this.aluno = aluno;
        this.codAluno = codAluno;
    }
   
}
