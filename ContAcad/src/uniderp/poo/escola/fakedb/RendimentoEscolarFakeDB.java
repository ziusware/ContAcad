package uniderp.poo.escola.fakedb;

import java.util.ArrayList;
import java.util.Random;

import uniderp.poo.escola.dominio.RendimentoEscolar;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB<RendimentoEscolar>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new RendimentoEscolar(1, "João", 1, "Artes", 5, 5, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.5, 3)));
        this.tabela.add(new RendimentoEscolar(2, "Maria", 2, "Português", 5, 5, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 5, 1.6)));
        this.tabela.add(new RendimentoEscolar(3, "Pedro", 3, "Geografia", 4, 3, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 3.8, 2.2)));
        this.tabela.add(new RendimentoEscolar(4, "Ana", 4, "Informática", 5, 5, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.2, 3.9)));
        this.tabela.add(new RendimentoEscolar(5, "Lucas", 5, "Matemática", 4, 4, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.7, 2.8)));
        this.tabela.add(new RendimentoEscolar(6, "Carla", 6, "História", 3, 3, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 3.5, 1.9)));
        this.tabela.add(new RendimentoEscolar(7, "Mariana", 7, "Ciências", 4, 4, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.0, 3.4)));
        this.tabela.add(new RendimentoEscolar(8, "Gustavo", 8, "Inglês", 5, 5, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.9, 4.1)));
        this.tabela.add(new RendimentoEscolar(9, "Beatriz", 9, "Educação Física", 4, 4, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.4, 3.2)));
        this.tabela.add(new RendimentoEscolar(10, "Ricardo", 10, "Química", 3, 3, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 3.7, 2.1)));
        this.tabela.add(new RendimentoEscolar(11, "Larissa", 11, "Artes", 5, 5, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.6, 4.0)));
        this.tabela.add(new RendimentoEscolar(12, "Felipe", 12, "Português", 4, 3, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 3.9, 3.5)));
        this.tabela.add(new RendimentoEscolar(13, "Isabela", 13, "Geografia", 5, 5, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.8, 4.2)));
        this.tabela.add(new RendimentoEscolar(14, "Thiago", 14, "Informática", 4, 4, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.3, 3.7)));
        this.tabela.add(new RendimentoEscolar(15, "Laura", 15, "Matemática", 5, 5, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.9, 4.1)));
        this.tabela.add(new RendimentoEscolar(16, "Gabriel", 16, "História", 3, 3, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 3.6, 3.2)));
        this.tabela.add(new RendimentoEscolar(17, "Camila", 17, "Ciências", 4, 4, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.2, 3.8)));
        this.tabela.add(new RendimentoEscolar(18, "Rafael", 18, "Inglês", 5, 5, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.7, 4.0)));
        this.tabela.add(new RendimentoEscolar(19, "Sofia", 19, "Educação Física", 4, 4, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 4.1, 3.5)));
        this.tabela.add(new RendimentoEscolar(20, "Daniel", 20, "Química", 3, 3, mediaTrabalhos(NotasAleatorios()), mediaGeral(NotasAleatorios(), 3.8, 2.8)));       
    }

    private ArrayList<Integer> NotasAleatorios(){
        Random rand = new Random();
        ArrayList<Integer> notasTrabalho = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int nota = rand.nextInt(11);
            notasTrabalho.add(nota);
        }
        return notasTrabalho;
    }

    private double mediaTrabalhos(ArrayList<Integer> notas){
        int totalNotas = 0;
        for (int i = 0; i < notas.size(); i++) {
            totalNotas += notas.get(i);
        }

        double media = (double) totalNotas / notas.size();
        return media;
    }

    private double mediaGeral(ArrayList<Integer> notasTrabalhos, double notaP1, double notaP2){
        double totalNotasTrabalhos = 0;
        for (int i = 0; i < notasTrabalhos.size(); i++) {
            totalNotasTrabalhos += notasTrabalhos.get(i);
        }

        double notaGeral = totalNotasTrabalhos + notaP1 + notaP2;
        double media = (double) notaGeral / (notasTrabalhos.size() + 2);
        return media;

    }
    
}
