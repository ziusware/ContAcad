package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.dominio.RendimentoEscolar;
import uniderp.poo.escola.fakedb.RendimentoEscolarFakeDB;

public class RendimentoEscolarRepositorio extends BaseGenericaCRUD<RendimentoEscolarFakeDB, RendimentoEscolar>{

    public RendimentoEscolarRepositorio(){
        this.db = new RendimentoEscolarFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public RendimentoEscolar Create(RendimentoEscolar instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public RendimentoEscolar Delete(int codigo) {
        RendimentoEscolar alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }

    @Override
    public RendimentoEscolar Read(int codigo) {
        for (RendimentoEscolar rendimentoEscolar : this.dataset) {
            if (rendimentoEscolar.getCodigo() == codigo)
                return rendimentoEscolar;
        }
        return null;
    }

    @Override
    public RendimentoEscolar Update(RendimentoEscolar instancia) {
        RendimentoEscolar alvo = this.Read(instancia.getCodigo());
        alvo.setCodigo(instancia.getCodigo());
        alvo.setAlunos(instancia.getAlunos());
        alvo.setTurmas(instancia.getTurmas());
        alvo.setNotaP1(instancia.getNotaP1());
        alvo.setNotaP2(instancia.getNotaP2());
        return alvo;
    }
    
}
