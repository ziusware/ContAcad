package uniderp.poo.escola.menu;

import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.servico.AlunoServico;

public class MenuAluno extends MenuGenerico{

    @Override
    protected void Menu(int codigo) {
        MenuNotas menu = new MenuNotas();
        do {
            System.out.println("\n#### ALUNOS ####");
            opcoesDisponiveis.clear();
            AlunoServico servAluno = new AlunoServico();
            for (Aluno aluno : servAluno.Listar()) {
                if(aluno.getCodigo() == codigo){
                    System.out.println(aluno.getCodigo() + " - " + aluno.getNome());
                    opcoesDisponiveis.add(aluno.getCodigo());
                }
            }
            System.out.println("0 - Voltar");
            System.out.print("Informe o código do aluno:");
            opcao = scan.nextInt();

            if(opcaoValida(opcao, opcoesDisponiveis)){
                menu.Menu(opcao);
            }else{
                System.out.println("Código Inválido");
            }

        } while (opcao != 0);
        
        
    }

    protected void MenuAlunos(){

        do {
            System.out.println("\n#### ALUNOS ####");
            opcoesDisponiveis.clear();
            AlunoServico servAluno = new AlunoServico();
            for (Aluno aluno : servAluno.Listar()) {
                System.out.println(aluno.getCodigo() + "- " + aluno.getNome());
                opcoesDisponiveis.add(aluno.getCodigo());
            }           
            System.out.println("0 - Voltar");
            System.out.print("Informe o código do aluno:");
            opcao = scan.nextInt();

            if(opcaoValida(opcao, opcoesDisponiveis)){
                Menu2(opcao);
            }else{
                System.out.println("Código Inválido");
            }

        } while (opcao != 0);
    }

    protected void Menu2(int codigo){
        do {
            System.out.println("\n#### INFORMAÇÕES ALUNO ####");
            opcoesDisponiveis.clear();
            System.out.println("1- Mostrar turmas");
            System.out.println("2- Mostrar disciplinas");
            System.out.println("3- Rendimento Escolar");
            System.out.println("0- Voltar");
            System.out.print("Digite uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    MenuTurma menu = new MenuTurma();
                    menu.Menu2(codigo);
                    break;
                case 2:
                    MenuDisciplina menuD = new MenuDisciplina();
                    menuD.Menu(codigo);
                    break;
                case 3:
                    MenuNotas menuN = new MenuNotas();
                    menuN.Menu(codigo);
                    break;
                default:
                    System.out.print("Opcão Inválida, tente novamente: ");
                    break;
            }
        } while (opcao!= 0);
        
    }


    
}
