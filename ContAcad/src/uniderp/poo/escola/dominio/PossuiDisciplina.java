package uniderp.poo.escola.dominio;

public abstract class PossuiDisciplina extends Identificador{
    protected String disciplina;
    protected int codDisciplina;

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public PossuiDisciplina(int codigo, String disciplina, int codDisciplina) {
        super(codigo);
        this.disciplina = disciplina;
        this.codDisciplina = codDisciplina;
    }

    

   

    
    
}
