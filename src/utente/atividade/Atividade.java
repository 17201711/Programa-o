package utente.atividade;

import java.time.LocalDate;
import java.util.Objects;

public class Atividade {
    private String tipoAtividade;
    private LocalDate inicio;
    private LocalDate fim;

    public Atividade() {

    }

    public Atividade(String tipoAtividade, LocalDate inicio, LocalDate fim) {
        this.tipoAtividade = tipoAtividade;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atividade atividade)) return false;
        return Objects.equals(tipoAtividade, atividade.tipoAtividade) && Objects.equals(inicio, atividade.inicio) && Objects.equals(fim, atividade.fim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoAtividade, inicio, fim);
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "tipoAtividade='" + tipoAtividade + '\'' +
                ", inicio=" + inicio +
                ", fim=" + fim +
                '}';
    }
}
