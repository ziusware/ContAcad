package uniderp.poo.escola.fakedb;

import java.time.LocalDate;

import uniderp.poo.escola.dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Professor(1, "Carlos", LocalDate.of(1981, 10, 5), "CarlosProf", "Senha@ProfCalors", "Professor"));
        this.tabela.add(new Professor(2, "Ana", LocalDate.of(1975, 8, 15), "AnaProf", "ProfAna123", "Professora"));
        this.tabela.add(new Professor(3, "Pedro", LocalDate.of(1990, 4, 12), "PedroProf", "Prof123Pedro", "Professor"));
        this.tabela.add(new Professor(4, "Maria", LocalDate.of(1985, 12, 30), "MariaProf", "MariaProf2023", "Professora"));
        this.tabela.add(new Professor(5, "Luísa", LocalDate.of(1988, 6, 20), "LuisaProf", "ProfLuiza88", "Professora"));
        
    }
    
    
    
}
