package utente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GestaoUtentes {

    private List<Utente> utentes = new ArrayList<>();

    public GestaoUtentes() {

    }

    public GestaoUtentes(List<Utente> utentes) {
        this.utentes = utentes;
    }

    public List<Utente> getUtentes() {
        return utentes;
    }

    public void setUtentes(List<Utente> utentes) {
        this.utentes = utentes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GestaoUtentes that)) return false;
        return Objects.equals(utentes, that.utentes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(utentes);
    }

    @Override
    public String toString() {
        return "GestaoUtentes{" +
                "utentes=" + utentes +
                '}';
    }
}
