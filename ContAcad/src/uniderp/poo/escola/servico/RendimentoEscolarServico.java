package uniderp.poo.escola.servico;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.RendimentoEscolar;
import uniderp.poo.escola.repositorio.RendimentoEscolarRepositorio;

public class RendimentoEscolarServico extends BaseGenericaServico<RendimentoEscolarRepositorio, RendimentoEscolar>{

    public RendimentoEscolarServico(){
        this.repo = new RendimentoEscolarRepositorio();
    }

    @Override
    public RendimentoEscolar Atualizar(RendimentoEscolar tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public RendimentoEscolar Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

    @Override
    public RendimentoEscolar Inserir(RendimentoEscolar tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public ArrayList<RendimentoEscolar> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public RendimentoEscolar Obter(int codigo) {
        return this.repo.Read(codigo);
    }
    
}