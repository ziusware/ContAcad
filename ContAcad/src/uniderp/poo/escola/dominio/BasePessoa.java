package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa extends PossuiNome{
    protected LocalDate dataNascimento;
    protected String username;
    protected String password;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public BasePessoa(int codigo, String nome, LocalDate dataNascimento, String username, String password) {
        super(codigo, nome);
        this.dataNascimento = dataNascimento;
        this.username = username;
        this.password = password;
    }
}
