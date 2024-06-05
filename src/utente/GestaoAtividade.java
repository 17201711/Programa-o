package utente;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class GestaoAtividade {
    private List<Atividade> atividades = new ArrayList<>();

    public void registarAtividade(String tipoAtividade, LocalTime inicio, LocalTime fim) {
        Atividade atividade = new Atividade(tipoAtividade, inicio, fim);
        atividades.add(atividade);
    }

    public Atividade consultarAtividade(LocalTime inicio, LocalTime fim) {
        for(Atividade atividade: atividades) {
            if(atividade.getInicio().equals(inicio) && atividade.getFim().equals(fim)) {
                return atividade;
            }
        }
        return null;
    }
}
