package uniderp.poo.escola.menu;

import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.servico.AlunoServico;

public class MenuDisciplina extends MenuGenerico{

    @Override
    protected void Menu(int codigo) {
        MenuNotas menu = new MenuNotas();

        do {
            System.out.println("\n#### DISCIPLINAS ####");
            opcoesDisponiveis.clear();
            AlunoServico servAluno = new AlunoServico();
            for (Aluno aluno : servAluno.Listar()) {
                if (aluno.getCodigo() == codigo ) {
                    System.out.println("\n---- DISCIPLINA DE " + aluno.getTurma().getDisciplina().getNome() + " -----");
                    System.out.println("Código da Disciplina: " + aluno.getTurma().getDisciplina().getCodigo());
                    System.out.println("Ementa da Disciplina: " + aluno.getTurma().getDisciplina().getEmenta());
                    System.out.println("Professor(a): " + aluno.getTurma().getProfessores().getNome());
                    opcoesDisponiveis.add(aluno.getTurma().getDisciplina().getCodigo());
                }
            }
            System.out.println("0- Voltar");
            System.out.print("Informe o código da Disciplina: ");
            opcao = scan.nextInt();

            if (opcaoValida(opcao, opcoesDisponiveis)) {
                menu.Menu(opcao);
            }else{
                System.out.println("Opção Inválida.");
            }

        } while (opcao != 0);
        
    }
    
}
