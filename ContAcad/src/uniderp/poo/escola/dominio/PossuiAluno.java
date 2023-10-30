package uniderp.poo.escola.dominio;

public abstract class PossuiAluno extends Identificador{
    protected Aluno aluno;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public PossuiAluno(int codigo, Aluno aluno) {
        super(codigo);
        this.aluno = aluno;
    }
   
}
