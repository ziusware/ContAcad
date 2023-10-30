package uniderp.poo.escola.servico;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.Professor;
import uniderp.poo.escola.repositorio.ProfessorRepositorio;

public class ProfessorServico extends BaseGenericaServico<ProfessorRepositorio, Professor>{

    public ProfessorServico(){
        this.repo = new ProfessorRepositorio();
    }

    @Override
    public Professor Atualizar(Professor tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Professor Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

    @Override
    public Professor Inserir(Professor tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public ArrayList<Professor> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Professor Obter(int codigo) {
        return this.repo.Read(codigo);
    }
    
}
