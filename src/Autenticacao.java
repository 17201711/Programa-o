import utente.GestaoUtentes;
import utente.Utente;

import java.util.List;

public class Autenticacao {

    private GestaoUtentes gestaoUtentes = new GestaoUtentes();

    public void login(Utente utente) {
        for(Utente utenteExistente: gestaoUtentes.getUtentes()) {
            if ((utenteExistente.getNome().equals(utente.getNome()))
                    || (utenteExistente.getNumUtente() == utente.getNumUtente())
                    || (utenteExistente.getNumTelefone() == utente.getNumTelefone())) {
                System.out.println("Login falhou!");
            }
        }
        System.out.println("Login com sucesso!");
    }

    public void registo(Utente utente) {
        List<Utente> utentes = gestaoUtentes.getUtentes();
        utentes.add(utente);

        gestaoUtentes.setUtentes(utentes);
    }
}
