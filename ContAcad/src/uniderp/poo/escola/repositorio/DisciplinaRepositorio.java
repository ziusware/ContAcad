package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.dominio.Disciplina;
import uniderp.poo.escola.fakedb.DisciplinaFakeDB;

public class DisciplinaRepositorio extends BaseGenericaCRUD<DisciplinaFakeDB, Disciplina>{

    public DisciplinaRepositorio(){
        this.db = new DisciplinaFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Disciplina Create(Disciplina instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Disciplina Delete(int codigo) {
        Disciplina alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }

    @Override
    public Disciplina Read(int codigo) {
        for (Disciplina disciplina : this.dataset) {
            if (disciplina.getCodigo() == codigo)
                return disciplina;
        }
        return null;
    }

    @Override
    public Disciplina Update(Disciplina instancia) {
        Disciplina alvo = this.Read(instancia.getCodigo());
        alvo.setCodigo(instancia.getCodigo());
        alvo.setNome(instancia.getNome());
        alvo.setEmenta(instancia.getEmenta());
        return alvo;
    }
    
}
