package uniderp.poo.escola.menu;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class MenuGenerico {
    protected ArrayList<Integer> opcoesDisponiveis = new ArrayList<Integer>();
    protected Scanner scan = new Scanner(System.in);
    protected int opcao = -1;   

    protected abstract void Menu(int codigo);

    protected boolean opcaoValida(int codigo, ArrayList<Integer> opcoesDisponiveis){
        for (Integer opcao : opcoesDisponiveis) {
            if(opcao == codigo){
                return true;
            }
        }
        return false;
    }
}
