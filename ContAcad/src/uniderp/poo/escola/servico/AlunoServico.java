package uniderp.poo.escola.servico;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.repositorio.AlunoRepositorio;

public class AlunoServico extends BaseGenericaServico<AlunoRepositorio, Aluno>{

    public AlunoServico(){
        this.repo = new AlunoRepositorio();
    }

    @Override
    public Aluno Atualizar(Aluno tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Aluno Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

    @Override
    public Aluno Inserir(Aluno tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public ArrayList<Aluno> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Aluno Obter(int codigo) {
        return this.repo.Read(codigo);
    }
    
}
