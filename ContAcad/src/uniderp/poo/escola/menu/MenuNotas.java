package uniderp.poo.escola.menu;

import uniderp.poo.escola.dominio.NotaTrabalho;
import uniderp.poo.escola.dominio.RendimentoEscolar;
import uniderp.poo.escola.servico.NotaTrabalhoServico;
import uniderp.poo.escola.servico.RendimentoEscolarServico;

public class MenuNotas extends MenuGenerico{

    @Override
    protected void Menu(int codigo) {
        do {
            RendimentoEscolarServico servRend = new RendimentoEscolarServico();
            for (RendimentoEscolar rendimento : servRend.Listar()) {
                if(codigo == rendimento.getAluno().getCodigo()){
                    System.out.println("---------------------------------");
                    System.out.println("Aluno: " + rendimento.getAluno().getNome());
                    System.out.println("Turma: " + rendimento.getTurma().getDisciplina().getNome());
                    System.out.println("Nota P1: " + rendimento.getNotaP1());
                    System.out.println("Nota P2: " + rendimento.getNotaP2());
                    System.out.println("*** Nota Trabalhos ***");
                    NotaTrabalhoServico servNotaTrabalho = new NotaTrabalhoServico();
                    for (NotaTrabalho notaTrabalho : servNotaTrabalho.Listar()){
                        if (notaTrabalho.getAluno().getCodigo() ==  codigo) {
                            System.out.println(notaTrabalho.getTrabalhos().getDisciplina().getNome() + ": " + notaTrabalho.getNota());
                            System.out.println("Descrição: " + notaTrabalho.getTrabalhos().getDescricao());
                        }
                    }
                    
                }
            }
            System.out.println("Digite 0 para voltar");
            opcao = scan.nextInt();
            
        } while (opcao != 0);
    }
}
