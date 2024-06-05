package hospital;

public class ConsultaHospitais {

    public Hospital consultar(Hospital hospital, String localidade) {
        if (hospital.getLocalidade().equals(localidade)) {
            return hospital;
        }
        return null;
    }
}
