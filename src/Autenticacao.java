import utente.Utente;

import java.time.LocalDate;
import java.util.List;

public class Autenticacao {

    public boolean login(List<Utente> utentes, String nome, int numUtente, int numTelefone) {
        for(Utente utente: utentes) {
            if ((utente.getNome().equals(nome))
                    || (utente.getNumUtente() == numUtente)
                    || (utente.getNumTelefone() == numTelefone)) {
                return false;
            }
        }
        return true;
    }

    public Utente registo(LocalDate dataDeNascimento, String nome, double altura, String genero, int numUtente, int numTelefone, String vicio) {
        return new Utente(dataDeNascimento, nome, altura, genero, numUtente, numTelefone, vicio);
    }
}
