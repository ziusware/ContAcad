package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa implements IImpressao{
    private int periodo;
    private Turma turma;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }


    public Aluno(int codigo, String nome, LocalDate dataNascimento, String username, String password, int periodo,
            Turma turma) {
        super(codigo, nome, dataNascimento, username, password);
        this.periodo = periodo;
        this.turma = turma;
    }

    @Override
    public void Imprimir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Periodo: " + this.periodo);
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);               
    }
    
}
