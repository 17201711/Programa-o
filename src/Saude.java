import hospital.ConsultaHospitais;
import hospital.Hospital;
import utente.Utente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static util.Tipos.CENTROS_RECUPERACAO;
import static util.Tipos.HOSPITAL;

public class Saude {
    private Autenticacao autenticacao = new Autenticacao();
    private ConsultaHospitais consultaHospitais = new ConsultaHospitais();
    private List<Utente> utentes = new ArrayList<>();
    private List<Hospital> hospitais = new ArrayList<>();

    public List<Utente> getUtentes() {
        return utentes;
    }

    public void setUtentes(List<Utente> utentes) {
        this.utentes = utentes;
    }

    public List<Hospital> getHospitais() {
        return hospitais;
    }

    public void setHospitais(List<Hospital> hospitais) {
        this.hospitais = hospitais;
    }

    public boolean login(List<Utente> utentes, String nome, int numUtente, int numTelefone) {
        return autenticacao.login(utentes, nome, numUtente, numTelefone);
    }

    public void registo(LocalDate dataDeNascimento, String nome, double altura, String genero, int numUtente, int numTelefone, String vicio) {
        Utente utente = autenticacao.registo(dataDeNascimento, nome, altura, genero, numUtente, numTelefone, vicio);
        utentes.add(utente);
    }

    public Hospital consultarHospital(String localidade) {
        for(Hospital hospital: hospitais) {
            return consultaHospitais.consultar(hospital, localidade);
        }

        return null;
    }

    public void adicionarHospital(String localidade, int numTelefone, String horario, String website, String tipo) {
        if (tipo.equals(HOSPITAL) || tipo.equals(CENTROS_RECUPERACAO)) {
            Hospital hospital = new Hospital(localidade, numTelefone, horario, website, tipo);
            hospitais.add(hospital);
        }
    }
}
