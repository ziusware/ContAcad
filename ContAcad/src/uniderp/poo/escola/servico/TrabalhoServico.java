package uniderp.poo.escola.servico;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.Trabalho;
import uniderp.poo.escola.repositorio.TrabalhoRepositorio;

public class TrabalhoServico extends BaseGenericaServico<TrabalhoRepositorio, Trabalho>{

    public TrabalhoServico(){
        this.repo = new TrabalhoRepositorio();
    }

    @Override
    public Trabalho Atualizar(Trabalho tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Trabalho Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

    @Override
    public Trabalho Inserir(Trabalho tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public ArrayList<Trabalho> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Trabalho Obter(int codigo) {
        return this.repo.Read(codigo);
    }
    
}