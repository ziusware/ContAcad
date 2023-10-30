package uniderp.poo.escola.dominio;

public class Turma extends PossuiDisciplina implements IImpressao{
    private String professor;
    private int codProfessor;

    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codProfessor = codProfessor;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professore) {
        this.professor = professore;
    }

    public Turma(int codigo, String disciplina, int codDisciplina, String professor, int codProfessor) {
        super(codigo, disciplina, codDisciplina);
        this.professor = professor;
        this.codProfessor = codProfessor;
    }

    @Override
    public void Imprimir() {
       System.out.println("Código: " + this.codigo);
       System.out.println("Disciplina: " + this.disciplina);
       System.out.println("Professor: " + this.professor);       
    }
    
    
}
