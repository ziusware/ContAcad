package uniderp.poo.escola.menu;

import uniderp.poo.escola.dominio.Professor;
import uniderp.poo.escola.servico.ProfessorServico;

public class MenuProfessor extends MenuGenerico{

    @Override
    protected void Menu(int codigo) {
        MenuTurma menu = new MenuTurma();
        do {
            System.out.println("\n#### PROFESSORES ####");
            opcoesDisponiveis.clear();
            ProfessorServico servProf = new ProfessorServico();
            for (Professor professor : servProf.Listar()) {
                System.out.println(professor.getCodigo() + "- " + professor.getNome());
                opcoesDisponiveis.add(professor.getCodigo());
            }
            System.out.println("0- Voltar");
            System.out.print("Informe o Código do Professor: ");
            opcao = scan.nextInt();

            if(opcaoValida(opcao, opcoesDisponiveis)){
                menu.Menu(opcao);
            }else{
                System.out.println("Código Inválido.");
            }
        } while (opcao != 0);
        
    }
    
}
