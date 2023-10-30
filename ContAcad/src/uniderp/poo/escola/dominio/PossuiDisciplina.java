package uniderp.poo.escola.dominio;

public abstract class PossuiDisciplina extends Identificador{
    protected Disciplina disciplina;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public PossuiDisciplina(int codigo, Disciplina disciplina) {
        super(codigo);
        this.disciplina = disciplina;
    }

      
    
}
