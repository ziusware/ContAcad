package uniderp.poo.escola.menu;

import java.util.ArrayList;
import java.util.Scanner;

import uniderp.poo.escola.repositorio.AlunoRepositorio;
import uniderp.poo.escola.repositorio.DisciplinaRepositorio;
import uniderp.poo.escola.repositorio.ProfessorRepositorio;
import uniderp.poo.escola.repositorio.RendimentoEscolarRepositorio;
import uniderp.poo.escola.repositorio.TurmaRepositorio;

public abstract class MenuGenerico {
    protected ArrayList<Integer> opcoesDisponiveis = new ArrayList<Integer>();
    protected Scanner scan = new Scanner(System.in);
    protected int opcao = -1;   
    protected ProfessorRepositorio repoProf = new ProfessorRepositorio();
    protected TurmaRepositorio repoTurma = new TurmaRepositorio();
    protected AlunoRepositorio repoAluno = new AlunoRepositorio();
    protected RendimentoEscolarRepositorio repoRend = new RendimentoEscolarRepositorio();
    protected DisciplinaRepositorio repoDisc = new DisciplinaRepositorio();

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
