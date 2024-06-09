package utente.vicio;

import java.util.ArrayList;
import java.util.List;

public class GestaoVicio {

    List<Vicio> vicios = new ArrayList<>();

    public List<String> consultarPoliticasVicio(String vicio) {
        for (Vicio vicioExistente: vicios) {
            if(vicioExistente.getNomeVicio().equals(vicio)) {
                return vicioExistente.getPoliticasRecuperacao();
            }
        }

        return new ArrayList<>();
    }
}
