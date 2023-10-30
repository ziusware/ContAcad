package uniderp.poo.escola.fakedb;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<TDom> {
    
    protected ArrayList<TDom> tabela;

    public ArrayList<TDom> getTabela(){
        if(this.tabela == null){
            this.tabela = new ArrayList<TDom>();
        }
        return this.tabela;
    }

    protected abstract void CarregarDados();

    public BaseGenericaFakeDB(){
        this.tabela = new ArrayList<TDom>();
        this.CarregarDados();
    }
}
