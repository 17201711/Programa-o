package utente;

import utente.vicio.Vicio;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Utente {
    private LocalDate dataDeNascimento;
    private String nome;
    private double altura;
    private String genero;
    private int numUtente;
    private int numTelefone;
    private List<Vicio> vicios;

    public Utente() {

    }

    public Utente(LocalDate dataDeNascimento, String nome, double altura, String genero, int numUtente, int numTelefone, List<Vicio> vicios) {
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
        this.altura = altura;
        this.genero = genero;
        this.numUtente = numUtente;
        this.numTelefone = numTelefone;
        this.vicios = vicios;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumUtente() {
        return numUtente;
    }

    public void setNumUtente(int numUtente) {
        this.numUtente = numUtente;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    public List<Vicio> getVicios() {
        return vicios;
    }

    public void setVicios(List<Vicio> vicios) {
        this.vicios = vicios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utente utente)) return false;
        return Double.compare(altura, utente.altura) == 0 && numUtente == utente.numUtente && numTelefone == utente.numTelefone && Objects.equals(dataDeNascimento, utente.dataDeNascimento) && Objects.equals(nome, utente.nome) && Objects.equals(genero, utente.genero) && Objects.equals(vicios, utente.vicios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataDeNascimento, nome, altura, genero, numUtente, numTelefone, vicios);
    }

    @Override
    public String toString() {
        return "Utente{" +
                "dataDeNascimento=" + dataDeNascimento +
                ", nome='" + nome + '\'' +
                ", altura=" + altura +
                ", genero='" + genero + '\'' +
                ", numUtente=" + numUtente +
                ", numTelefone=" + numTelefone +
                ", vicios=" + vicios +
                '}';
    }
}


