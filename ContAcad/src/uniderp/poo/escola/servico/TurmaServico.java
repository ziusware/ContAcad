package uniderp.poo.escola.servico;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.Turma;
import uniderp.poo.escola.repositorio.TurmaRepositorio;

public class TurmaServico extends BaseGenericaServico<TurmaRepositorio, Turma>{

    public TurmaServico(){
        this.repo = new TurmaRepositorio();
    }

    @Override
    public Turma Atualizar(Turma tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Turma Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

    @Override
    public Turma Inserir(Turma tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public ArrayList<Turma> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Turma Obter(int codigo) {
        return this.repo.Read(codigo);
    }
    
}