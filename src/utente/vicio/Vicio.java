package utente.vicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vicio {
    private String nomeVicio;
    private List<String> politicasRecuperacao = new ArrayList<>();

    public Vicio() {
    }

    public Vicio(String nomeVicio, List<String> politicasRecuperacao) {
        this.nomeVicio = nomeVicio;
        this.politicasRecuperacao = politicasRecuperacao;
    }

    public String getNomeVicio() {
        return nomeVicio;
    }

    public void setNomeVicio(String nomeVicio) {
        this.nomeVicio = nomeVicio;
    }

    public List<String> getPoliticasRecuperacao() {
        return politicasRecuperacao;
    }

    public void setPoliticasRecuperacao(List<String> politicasRecuperacao) {
        this.politicasRecuperacao = politicasRecuperacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vicio vicio)) return false;
        return Objects.equals(nomeVicio, vicio.nomeVicio) && Objects.equals(politicasRecuperacao, vicio.politicasRecuperacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeVicio, politicasRecuperacao);
    }

    @Override
    public String toString() {
        return "Vicio{" +
                "nomeVicio='" + nomeVicio + '\'' +
                ", politicasRecuperacao=" + politicasRecuperacao +
                '}';
    }
}
