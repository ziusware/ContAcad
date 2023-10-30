package uniderp.poo.escola.menu;

import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.dominio.Professor;
import uniderp.poo.escola.dominio.Turma;
import uniderp.poo.escola.servico.AlunoServico;
import uniderp.poo.escola.servico.TurmaServico;

public class MenuTurma extends MenuGenerico{

    @Override
    protected void Menu(int codigo) {
        MenuAluno menu = new MenuAluno();
        do {
            System.out.println("\n#### TURMAS ####");
            opcoesDisponiveis.clear();
            TurmaServico servTurma = new TurmaServico();
            for (Turma turma : servTurma.Listar()) {
                if (turma.getProfessores().getCodigo() == codigo) {
                    for (Professor professor : repoProf.ReadAll()) {
                        if(professor.getCodigo() == turma.getProfessores().getCodigo()){
                           System.out.println(turma.getCodigo() + " - " + turma.getDisciplina().getNome());
                           opcoesDisponiveis.add(turma.getCodigo());
                        }
                    }
                }
            }
            System.out.println("0 - Voltar");
            System.out.print("Informe o código da disciplina:");
            opcao = scan.nextInt();

            if(opcaoValida(opcao, opcoesDisponiveis)){
                menu.Menu(opcao);
            }else{
                System.out.println("Código Inválido, tente novamente.");
            }

            

        } while (opcao != 0);
        
    }

    protected void Menu2(int codigo){
         do {
            AlunoServico servAluno = new AlunoServico();
            for (Aluno aluno : servAluno.Listar()) {
                if(codigo == aluno.getCodigo()){
                    System.out.println("\n----- TURMA DE " + aluno.getTurma().getDisciplina().getNome() + " -----");
                    System.out.println("Código da Turma: " + aluno.getTurma().getCodigo());
                    System.out.println("Capacidade: "+ aluno.getTurma().getCapacidade());
                    System.out.println("Professor(a): " + aluno.getTurma().getProfessores().getNome());
                }
                         
            }
            System.out.println("Digite 0 para voltar");
            opcao = scan.nextInt();
            
        } while (opcao != 0);
    }
    
}
