package uniderp.poo.escola.fakedb;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.Disciplina;
import uniderp.poo.escola.dominio.Professor;
import uniderp.poo.escola.dominio.Turma;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma>{

    @Override
    protected void CarregarDados() {
        DisciplinaFakeDB discFakeDB = new DisciplinaFakeDB();
        ArrayList<Disciplina> disc = discFakeDB.getTabela();
        ProfessorFakeDB profFakeDB = new ProfessorFakeDB();
        ArrayList<Professor> professor = profFakeDB.getTabela();
        
        this.tabela.add(new Turma(1, disc.get(0), professor.get(0), 10));
        this.tabela.add(new Turma(2, disc.get(1), professor.get(0), 10));
        this.tabela.add(new Turma(3, disc.get(2), professor.get(1), 10));
        this.tabela.add(new Turma(4, disc.get(3), professor.get(1), 10));
        this.tabela.add(new Turma(5, disc.get(4), professor.get(2), 10));
        this.tabela.add(new Turma(6, disc.get(5), professor.get(2), 10));
        this.tabela.add(new Turma(7, disc.get(6), professor.get(3), 10));
        this.tabela.add(new Turma(8, disc.get(7), professor.get(3), 10));
        this.tabela.add(new Turma(9, disc.get(8), professor.get(4), 10));
        this.tabela.add(new Turma(10, disc.get(9), professor.get(4), 10));
    }

    public TurmaFakeDB(){
        super();
    }   
    
}
