package Filmes;

import TelaInicial.Interface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Movie implements Comparable<Movie>, Comparator<Movie>, Interface, Serializable {

    private String titulo;
    private Double media = 0.0;
    private int ano;
    private Categoria categoria;
    private ArrayList<NotaFilme> notaFilme = new ArrayList();
    private int contadorNota = 0;
    private int nota = 0;

    public Movie(String titulo, int ano, Categoria categoria) {
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
    }

    public Movie(String titulo, int ano, Categoria categoria, String usuario, int nota) {

        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
        NotaFilme notadofilme = new NotaFilme(usuario, nota);
        this.notaFilme.add(notadofilme);
    }

    public Movie() {
    }

    ;

    public ArrayList<NotaFilme> getNotaFilme() {
        return notaFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Movie o) {//usa para por em ordem alfabetica

        return (this.titulo.toLowerCase().compareTo(o.getTitulo()
                .toLowerCase()));

    }

    public void fazerMedia() { // faz a media
        if (!notaFilme.isEmpty()) {
            for (NotaFilme notaFilme1 : notaFilme) {
                nota = nota + notaFilme1.getNota();
                contadorNota = contadorNota + 1;
            }
            this.media = (double) this.nota / this.contadorNota;
            this.nota = 0;
            this.contadorNota = 0;
            if (this.media.isNaN()) {
                double aux = 0.1;
                media = aux;
            }
        } else {
            JOptionPane.showMessageDialog(null, "nota filmes ta vazio");
            media = 0.0;
        }
    }

    @Override
    public int compare(Movie o1, Movie o2) {//usa para organizar pela media
        if (o1.getMedia() < o2.getMedia()) {
            return 1;
        }
        if (o1.getMedia() > o2.getMedia()) {
            return -1;
        }
        return 0;
    }

    public boolean jaContemNaLista() {

        for (NotaFilme notaFilme1 : notaFilme) {
            if (notaFilme1.getUsuario().equals(usuariologado.getLogin())) {
                return true;
            }
        }
        return false;
    }

}
