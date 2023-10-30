package uniderp.poo.escola.repositorio;

import java.util.ArrayList;

public abstract class BaseGenericaCRUD<TFakeDB, TDom> {
    protected TFakeDB db;

    protected ArrayList<TDom> dataset;
    

    public abstract TDom Create(TDom instancia);

    public abstract TDom Read(int codigo);

    public ArrayList<TDom> ReadAll(){
        return this.dataset;
    }

    public abstract TDom Update(TDom instancia);

    public abstract TDom Delete(int codigo);
}
