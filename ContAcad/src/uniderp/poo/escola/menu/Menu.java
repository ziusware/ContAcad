package uniderp.poo.escola.menu;

public class Menu extends MenuGenerico{

    @Override
    public void Menu(int codigo) {
        MenuProfessor menu = new MenuProfessor();
        MenuAluno menu2 = new MenuAluno();
        do {
            System.out.println("#### MENU PRINCIPAL ####");
            System.out.println("1. Professor");
            System.out.println("2. Aluno");
            System.out.println("0. Encerrar");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    menu.Menu(codigo);;
                    break;
                case 2:
                    menu2.MenuAlunos();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
        
    }   
}
