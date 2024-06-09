import hospital.GestaoHospitais;
import utente.GestaoUtentes;
import utente.atividade.GestaoAtividade;
import utente.vicio.GestaoVicio;

import java.util.Scanner;

public class Main {

    private static LerDados lerDados = new LerDados();

    public static void main(String[] args) {
        Autenticacao gestaoAutenticacao = new Autenticacao();
        GestaoHospitais gestaoHospitais = new GestaoHospitais();
        GestaoAtividade gestaoAtividade = new GestaoAtividade();
        GestaoVicio gestaoVicio = new GestaoVicio();
        GestaoUtentes gestaoUtentes = new GestaoUtentes();

        int opcaoSelecionada = menu();
        while(opcaoSelecionada != 9) {
            switch(opcaoSelecionada) {
                case 1: gestaoAutenticacao.registo(lerDados.registo()); break;
                case 2: gestaoAutenticacao.login(lerDados.login()); break;
                case 3: ImprimirDados.imprimirHospitaisDaConsulta(gestaoHospitais.consultar(lerDados.consultarHospitais())); break;
                case 4: gestaoAtividade.registarAtividade(lerDados.registarAtividade()); break;
                case 5: ImprimirDados.imprimirAtividadesConsultadas(gestaoAtividade.consultarAtividades(lerDados.consultarAtividades())); break;
                case 6: ImprimirDados.imprimirPoliticasVicio(gestaoVicio.consultarPoliticasVicio(lerDados.lerVicio())); break;
                case 7: ImprimirDados.imprimirUtentes(gestaoUtentes.getUtentes()); break;
                case 8: gestaoHospitais.adicionarHospital(lerDados.registarHospital()); break;
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
}