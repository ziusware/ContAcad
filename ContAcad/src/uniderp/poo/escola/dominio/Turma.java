package uniderp.poo.escola.dominio;

public class Turma extends PossuiDisciplina implements IImpressao{
    private Professor professores;
    private int capacidade;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Professor getProfessores() {
        return professores;
    }

    public void setProfessores(Professor professores) {
        this.professores = professores;
    }

    public Turma(int codigo, Disciplina disciplina, Professor professores, int capacidade) {
        super(codigo, disciplina);
        this.professores = professores;
        this.capacidade = capacidade;
    }

    @Override
    public void Imprimir() {
       System.out.println("Código: " + this.codigo);
       System.out.println("Disciplina: " + this.disciplina);
       System.out.println("Professor: " + this.professores);       
    }
    
}
