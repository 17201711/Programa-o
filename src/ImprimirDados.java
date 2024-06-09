import hospital.Hospital;
import utente.Utente;
import utente.atividade.Atividade;
import utente.vicio.Vicio;

import java.util.List;

public class ImprimirDados {

    private ImprimirDados() {}

    public static void imprimirHospitaisDaConsulta(List<Hospital> hospitais) {
        System.out.println("-------------------------\n");

        for(Hospital hospital: hospitais) {
            System.out.println("Localidade: " + hospital.getLocalidade());
            System.out.println("Numero telefone: " + hospital.getNumTelefone());
            System.out.println("Horario: " + hospital.getHorario());
            System.out.println("Website: " + hospital.getWebsite());
            System.out.println("Tipo: " + hospital.getTipo());
        }
    }

    public static void imprimirAtividadesConsultadas(List<Atividade> atividades) {
        System.out.println("-------------------------\n");

        for(Atividade atividade: atividades) {
            System.out.println("Tipo atividade: " + atividade.getTipoAtividade());
            System.out.println("Inicio atividade: " + atividade.getInicio().toString());
            System.out.println("Fim atividade: " + atividade.getFim().toString());
        }
    }

    public static void imprimirPoliticasVicio(List<String> politicas) {
        System.out.println("-------------------------\n");

        for(String politica: politicas) {
            System.out.println("Politica do vicio: " + politica);
        }
    }

    public static void imprimirUtentes(List<Utente> utentes) {
        System.out.println("-------------------------\n");

        for(Utente utente: utentes) {
            System.out.println("Nome utente: " + utente.getNome());
            System.out.println("Data nascimento utente: " + utente.getDataDeNascimento().toString());
            System.out.println("Altura utente: " + utente.getAltura());
            System.out.println("Genero utente: " + utente.getGenero());
            System.out.println("Numero utente: " + utente.getNumUtente());
            System.out.println("Numero telefone utente: " + utente.getNumTelefone());
            for(Vicio vicio: utente.getVicios()) {
                System.out.println("Vicio: " + vicio.getNomeVicio());
                imprimirPoliticasVicio(vicio.getPoliticasRecuperacao());
            }
        }
    }
}
