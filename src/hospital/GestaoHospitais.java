package hospital;

import java.util.ArrayList;
import java.util.List;

public class GestaoHospitais {

    private List<Hospital> hospitais = new ArrayList<>();

    public List<Hospital> consultar(String localidade) {
        List<Hospital> hospitaisDaZona = new ArrayList<>();

        for(Hospital hospital: hospitais) {
            if (hospital.getLocalidade().equals(localidade)) {
                hospitaisDaZona.add(hospital);
            }
        }

        return hospitaisDaZona;
    }

    public void adicionarHospital(Hospital hospital) {
        hospitais.add(hospital);
    }
}
