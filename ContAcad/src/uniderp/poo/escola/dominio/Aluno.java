package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa implements IImpressao{
    private int periodo;
    private int codDisciplina;
    private int codTurma;

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public Aluno(int codigo, String nome, LocalDate dataNascimento, String username, String password, int periodo,
            int codDisciplina, int codTurma) {
        super(codigo, nome, dataNascimento, username, password);
        this.periodo = periodo;
        this.codDisciplina = codDisciplina;
        this.codTurma = codTurma;
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
