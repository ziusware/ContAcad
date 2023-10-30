package uniderp.poo.escola.fakedb;

import uniderp.poo.escola.dominio.Trabalho;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Trabalho(1, "Artes", 1, "Trabalho de Artes"));
        this.tabela.add(new Trabalho(2, "Português", 2, "Trab de por"));
        this.tabela.add(new Trabalho(3, "Geografia", 3, "Trab de geo"));
        this.tabela.add(new Trabalho(4, "Informática", 4, "Trab de info"));
        this.tabela.add(new Trabalho(5, "Matemática", 5, "Traba de mat"));
    }
    
}
