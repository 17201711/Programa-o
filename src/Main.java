import hospital.GestaoHospitais;
import hospital.Hospital;
import utente.GestaoUtentes;
import utente.Utente;
import utente.atividade.Atividade;
import utente.atividade.GestaoAtividade;
import utente.vicio.GestaoVicio;
import utente.vicio.Vicio;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static LeituraDados leituraDados = new LeituraDados();

    public static void main(String[] args) {
        Autenticacao gestaoAutenticacao = new Autenticacao();
        GestaoHospitais gestaoHospitais = new GestaoHospitais();
        GestaoAtividade gestaoAtividade = new GestaoAtividade();
        GestaoVicio gestaoVicio = new GestaoVicio();
        GestaoUtentes gestaoUtentes = new GestaoUtentes();

        int opcaoSelecionada = menu();
        while(opcaoSelecionada != 9) {
            switch(opcaoSelecionada) {
                case 1: gestaoAutenticacao.registo(leituraDados.registo()); break;
                case 2: gestaoAutenticacao.login(leituraDados.login()); break;
                case 3: imprimirHospitaisDaConsulta(gestaoHospitais.consultar(leituraDados.consultarHospitais())); break;
                case 4: gestaoAtividade.registarAtividade(leituraDados.registarAtividade()); break;
                case 5: imprimirAtividadesConsultadas(gestaoAtividade.consultarAtividades(leituraDados.consultarAtividades())); break;
                case 6: imprimirPoliticasVicio(gestaoVicio.consultarPoliticasVicio(leituraDados.lerVicio())); break;
                case 7: imprimirUtentes(gestaoUtentes.getUtentes()); break;
                case 8: gestaoHospitais.adicionarHospital(leituraDados.registarHospital()); break;
                case 9: System.exit(0);
                default: System.out.println("Opcao invalida. Tente novamente"); break;
            }

            opcaoSelecionada = menu();
        }
    }

    private static int menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolhe uma opcao");
        System.out.println("-------------------------\n");
        System.out.println("1 - Registar utente");
        System.out.println("2 - Login");
        System.out.println("3 - Consultar hospitais");
        System.out.println("4 - Registar Atividade");
        System.out.println("5 - Consultar atividades");
        System.out.println("6 - Consultar politicas recuperacao do vicio");
        System.out.println("-------------------------\n");
        System.out.println("7 - Consultar utentes");
        System.out.println("8 - Registar dados dos hospitais");
        System.out.println("9 - Sair");

        return input.nextInt();
    }

    private static void imprimirHospitaisDaConsulta(List<Hospital> hospitais) {
        for(Hospital hospital: hospitais) {
            System.out.println(hospital.getLocalidade());
            System.out.println(hospital.getNumTelefone());
            System.out.println(hospital.getHorario());
            System.out.println(hospital.getWebsite());
            System.out.println(hospital.getTipo());
        }
    }

    private static void imprimirAtividadesConsultadas(List<Atividade> atividades) {
        System.out.println("-------------------------\n");

        for(Atividade atividade: atividades) {
            System.out.println(atividade.getTipoAtividade());
            System.out.println(atividade.getInicio().toString());
            System.out.println(atividade.getFim().toString());
        }
    }

    private static void imprimirPoliticasVicio(List<String> politicas) {
        System.out.println("-------------------------\n");

        for(String politica: politicas) {
            System.out.println(politica);
        }
    }

    private static void imprimirUtentes(List<Utente> utentes) {
        System.out.println("-------------------------\n");

        for(Utente utente: utentes) {
            System.out.println(utente.getDataDeNascimento().toString());
            System.out.println(utente.getNome());
            System.out.println(utente.getAltura());
            System.out.println(utente.getGenero());
            System.out.println(utente.getNumUtente());
            System.out.println(utente.getNumTelefone());
            for(Vicio vicio: utente.getVicios()) {
                System.out.println(vicio.getNomeVicio());
                imprimirPoliticasVicio(vicio.getPoliticasRecuperacao());
            }
        }
    }
}