package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa implements IImpressao{
    
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Professor(int codigo, String nome, LocalDate dataNascimento, String username, String password,
            String cargo) {
        super(codigo, nome, dataNascimento, username, password);
        this.cargo = cargo;
    }

    @Override
    public void Imprimir() {
        System.out.println("Código: "+ this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);       
    }   
    
}
