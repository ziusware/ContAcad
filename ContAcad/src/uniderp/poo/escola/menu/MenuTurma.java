package uniderp.poo.escola.menu;

import uniderp.poo.escola.dominio.Professor;
import uniderp.poo.escola.dominio.Turma;

public class MenuTurma extends MenuGenerico{

    @Override
    protected void Menu(int codigo) {
        MenuAluno menu = new MenuAluno();
        do {
            System.out.println("#### TURMAS ####");
            opcoesDisponiveis.clear();
            for (Turma turma : repoTurma.ReadAll()) {
                if (turma.getCodProfessor() == codigo) {
                    for (Professor professor : repoProf.ReadAll()) {
                        if(professor.getCodigo() == turma.getCodProfessor()){
                           System.out.println(turma.getCodigo() + " - " + turma.getDisciplina());
                           opcoesDisponiveis.add(turma.getCodigo());
                        }
                    }
                }
            }
            System.out.println("0 - Voltar");
            System.out.print("Informe o código da disciplina:");
            opcao = scan.nextInt();

            if(opcao == 0) break;

            if(opcaoValida(opcao, opcoesDisponiveis)){
                menu.Menu(opcao);
            }else{
                System.out.println("Código Inválido, tente novamente.");
            }

            

        } while (opcao != 0);
        
    }

    protected void Menu2(int codigo){
         do {
            for (Turma turma : repoTurma.ReadAll()) {
                if(turma.getCodDisciplina() == codigo){
                    turma.Imprimir();
                }
            }
            System.out.println("Digite 0 para voltar");
            opcao = scan.nextInt();
            
        } while (opcao != 0);
    }
    
}
