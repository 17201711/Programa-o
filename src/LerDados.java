import hospital.Hospital;
import utente.Utente;
import utente.atividade.Atividade;
import utente.vicio.Vicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerDados {

    private Scanner scanner = new Scanner(System.in);

    public Utente registo() {

        System.out.println("Inserir data de nascimento");
        LocalDate dataDeNascimento = LocalDate.parse(scanner.next());

        System.out.println("Inserir nome");
        String nome = scanner.next();

        System.out.println("Inserir altura");
        double altura = scanner.nextDouble();

        System.out.println("Inserir genero");
        String genero = scanner.next();

        System.out.println("Inserir numero utente");
        int numUtente = scanner.nextInt();

        System.out.println("Inserir numero telefone");
        int numTelefone = scanner.nextInt();

        System.out.println("Inserir nome do vicio");
        String nomeVicio = scanner.next();
        Vicio vicio = new Vicio();
        vicio.setNomeVicio(nomeVicio);
        List<Vicio> vicios = new ArrayList<>();
        vicios.add(vicio);

        Utente utente = new Utente(dataDeNascimento, nome, altura, genero, numUtente, numTelefone, vicios);
        return utente;
    }

    public Utente login() {
        System.out.println("Inserir nome");
        String nome = scanner.next();

        System.out.println("Inserir numero utente");
        int numUtente = scanner.nextInt();

        System.out.println("Inserir numero telefone");
        int numTelefone = scanner.nextInt();

        Utente utente = new Utente();
        utente.setNome(nome);
        utente.setNumUtente(numUtente);
        utente.setNumTelefone(numTelefone);

        return utente;
    }

    public String consultarHospitais() {
        System.out.println("Inserir localidade");
        String localidade = scanner.next();

        return localidade;
    }

    public Atividade registarAtividade() {
        System.out.println("Inserir tipo atividade");
        String tipoAtividade = scanner.next();

        System.out.println("Inserir inicio atividade");
        LocalDate inicioAtividade = LocalDate.parse(scanner.next());

        System.out.println("Inserir fim atividade");
        LocalDate fimAtividade = LocalDate.parse(scanner.next());

        Atividade atividade = new Atividade(tipoAtividade, inicioAtividade, fimAtividade);

        return atividade;
    }

    public Atividade consultarAtividades() {
        System.out.println("Inserir inicio atividade");
        LocalDate inicioAtividade = LocalDate.parse(scanner.next());

        System.out.println("Inserir fim atividade");
        LocalDate fimAtividade = LocalDate.parse(scanner.next());

        Atividade atividade = new Atividade();
        atividade.setInicio(inicioAtividade);
        atividade.setFim(fimAtividade);

        return atividade;
    }

    public String lerVicio() {
        System.out.println("Inserir vicio");
        String vicio = scanner.next();

        return vicio;
    }

    public Hospital registarHospital() {
        System.out.println("Inserir localidade");
        String localidade = scanner.next();

        System.out.println("Inserir numero telefone");
        int numTelefone = scanner.nextInt();

        System.out.println("Inserir horario");
        String horario = scanner.next();

        System.out.println("Inserir website");
        String website = scanner.next();

        System.out.println("Inserir tipo");
        String tipo = scanner.next();

        Hospital hospital = new Hospital(localidade, numTelefone, horario, website, tipo);

        return hospital;
    }
}
