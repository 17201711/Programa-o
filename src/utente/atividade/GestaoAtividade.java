package utente.atividade;

import java.util.ArrayList;
import java.util.List;

public class GestaoAtividade {
    private List<Atividade> atividades = new ArrayList<>();

    public void registarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public List<Atividade> consultarAtividades(Atividade atividade) {
        List<Atividade> atividadePedida = new ArrayList<>();

        for(Atividade atividadeExistente: atividades) {
            if(atividadeExistente.getInicio().toString().equals(atividade.getInicio().toString())
                    && atividadeExistente.getFim().toString().equals(atividade.getFim().toString())) {
                atividadePedida.add(atividadeExistente);
            }
        }
        return atividadePedida;
    }
}
