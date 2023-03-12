package Ejercicio2;

public class Obra {
    private String titulo;
    private String autor;
    private int numeroObra;

    public Obra(String titulo, String autor, int numeroObra) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroObra = numeroObra;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroObra() {
        return numeroObra;
    }

    @Override
    public String toString() {
        return "";
    }
}
