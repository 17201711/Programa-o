package utente;

import java.time.LocalTime;
import java.util.Objects;

public class Atividade {
    private String tipoAtividade;
    private LocalTime inicio;
    private LocalTime fim;

    public Atividade(String tipoAtividade, LocalTime inicio, LocalTime fim) {
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

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public LocalTime getFim() {
        return fim;
    }

    public void setFim(LocalTime fim) {
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
