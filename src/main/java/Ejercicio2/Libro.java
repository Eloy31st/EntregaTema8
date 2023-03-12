package Ejercicio2;

public class Libro extends Obra{
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroObra, int numeroPaginas) {
        super(titulo, autor, numeroObra);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro: " + getTitulo() + " de " + getAutor() + " (" + getNumeroPaginas() + " páginas)";
    }
}
