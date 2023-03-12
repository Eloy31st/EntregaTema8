package Ejercicio2;

public class Video extends Obra{
    private int duracion;

    public Video(String titulo, String autor, int numeroObra, int duracion) {
        super(titulo, autor, numeroObra);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public String duracionEnHoras() {
        int horas = duracion / 60;
        int minutos = duracion % 60;
        return horas + "h " + minutos + "m";
    }

    @Override
    public String toString() {
        return super.toString() + "Video: " + getTitulo() + " de " + getAutor() + " (" + duracionEnHoras() + ")";
    }
}
