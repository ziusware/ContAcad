package uniderp.poo.escola.servico;

import java.util.ArrayList;

public abstract class BaseGenericaServico<TRepo, TDom> {
    protected TRepo repo;

    public abstract TDom Inserir(TDom tupla);
    public abstract TDom Obter(int codigo);
    public abstract ArrayList<TDom> Listar();
    public abstract TDom Atualizar(TDom tupla);
    public abstract TDom Excluir(int codigo);
    
    public BaseGenericaServico(){}
}
