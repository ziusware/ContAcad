package uniderp.poo.escola.menu;

import uniderp.poo.escola.dominio.Professor;
import uniderp.poo.escola.repositorio.ProfessorRepositorio;

public class MenuProfessor extends MenuGenerico{

    @Override
    protected void Menu(int codigo) {
        MenuTurma menu = new MenuTurma();
        do {
            System.out.println("#### PROFESSORES ####");
            opcoesDisponiveis.clear();
            ProfessorRepositorio repoProf = new ProfessorRepositorio();
            for (Professor professor : repoProf.ReadAll()) {
                System.out.println(professor.getCodigo() + " - " + professor.getNome());
                opcoesDisponiveis.add(professor.getCodigo());
            }
            System.out.println("0 - Voltar");
            System.out.print("Informe o código do professor:");
            opcao = scan.nextInt();

            if(opcao == 0) break;

            if(opcaoValida(opcao, opcoesDisponiveis)){
                menu.Menu(opcao);
            }else{
                System.out.println("Código Inválido, tente novamente.");
            }

            
                        
        } while (opcao != 0);
        
    }
    
}
