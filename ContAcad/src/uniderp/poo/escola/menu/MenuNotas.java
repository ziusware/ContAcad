package uniderp.poo.escola.menu;

import uniderp.poo.escola.dominio.RendimentoEscolar;

public class MenuNotas extends MenuGenerico{

    @Override
    protected void Menu(int codigo) {
        do {
            for (RendimentoEscolar rendimento : repoRend.ReadAll()) {
                if(rendimento.getCodAluno() == codigo){
                    rendimento.Imprimir();
                }
            }
            System.out.println("Digite 0 para voltar");
            opcao = scan.nextInt();
            
        } while (opcao != 0);
    }
}
