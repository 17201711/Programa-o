package hospital;

import java.util.Objects;

public class Hospital {
    private String localidade;
    private int numTelefone;
    private String horario;
    private String website;
    private String tipo;

    public Hospital(String localidade, int numTelefone, String horario, String website, String tipo) {
        this.localidade = localidade;
        this.numTelefone = numTelefone;
        this.horario = horario;
        this.website = website;
        this.tipo = tipo;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hospital hospital)) return false;
        return numTelefone == hospital.numTelefone && Objects.equals(localidade, hospital.localidade) && Objects.equals(horario, hospital.horario) && Objects.equals(website, hospital.website) && Objects.equals(tipo, hospital.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localidade, numTelefone, horario, website, tipo);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "localidade='" + localidade + '\'' +
                ", numTelefone=" + numTelefone +
                ", horario='" + horario + '\'' +
                ", website='" + website + '\'' +
                ", hospital.tipo='" + tipo + '\'' +
                '}';
    }
}
