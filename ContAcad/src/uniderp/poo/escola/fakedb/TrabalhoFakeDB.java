package uniderp.poo.escola.fakedb;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.Disciplina;
import uniderp.poo.escola.dominio.Trabalho;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho>{

    @Override
    protected void CarregarDados() {
        DisciplinaFakeDB discFakeDB = new DisciplinaFakeDB();
        ArrayList<Disciplina> disc = discFakeDB.getTabela();

        this.tabela.add(new Trabalho(1, disc.get(0), "TRABALHO DE ARTES"));
        this.tabela.add(new Trabalho(2, disc.get(1), "TRABALHO DE PORTUGUÊS"));
        this.tabela.add(new Trabalho(3, disc.get(2), "TRABALHO DE GEOGRAFIA"));
        this.tabela.add(new Trabalho(4, disc.get(3), "TRABALHO DE INFORMÁTICA"));
        this.tabela.add(new Trabalho(5, disc.get(4), "TRABALHO DE MATEMÁTICA"));
        this.tabela.add(new Trabalho(6, disc.get(5), "TRABALHO DE HISTÓRIA"));
        this.tabela.add(new Trabalho(7, disc.get(6), "TRABALHO DE CIÊNCIAS"));
        this.tabela.add(new Trabalho(8, disc.get(7), "TRABALHO DE INGÊS"));
        this.tabela.add(new Trabalho(9, disc.get(8), "TRABALHO DE ED. FÍSICA"));
        this.tabela.add(new Trabalho(10, disc.get(9), "TRABALHO DE QUÍMICA"));
    }
    
    public TrabalhoFakeDB(){
        super();
    }
}
