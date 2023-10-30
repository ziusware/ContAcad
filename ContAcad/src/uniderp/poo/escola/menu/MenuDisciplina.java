package uniderp.poo.escola.menu;

import java.util.HashSet;
import java.util.Set;

import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.dominio.Disciplina;

public class MenuDisciplina extends MenuGenerico{

    @Override
    protected void Menu(int codigo) {
        MenuNotas menu = new MenuNotas();
        Set<Integer> discExibidas = new HashSet<>();
        
        do {
            System.out.println("#### Disciplinas ####");
            opcoesDisponiveis.clear();
            for (Disciplina disc : repoDisc.ReadAll()) {
                for (Aluno aluno : repoAluno.ReadAll()) {
                    if (disc.getCodigo() == aluno.getCodDisciplina() && !discExibidas.contains(disc.getCodigo())) {
                        System.out.println(disc.getCodigo() + " - " + disc.getNome());
                        discExibidas.add(disc.getCodigo()); // Adiciona o código da disciplina ao conjunto
                        opcoesDisponiveis.add(disc.getCodigo());
                    }
                }
            }            
            System.out.println("0- Voltar");
            System.out.print("Informe o código da disciplina: ");
            opcao = scan.nextInt();

            if (opcao == 0) break;
            
            if (opcaoValida(opcao, opcoesDisponiveis)) {
                menu.Menu(opcao);
            }else{
                System.out.println("Código Inválido, tente novamente.");
            }

        } while (opcao != 0);
        
    }
    
}
