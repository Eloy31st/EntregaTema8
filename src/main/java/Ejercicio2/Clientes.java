package Ejercicio2;

public class Clientes {
    private String nombre;
    private int numeroCliente;

    public Clientes(String nombre, int numeroCliente) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    @Override
    public String toString() {
        return "Cliente n.°" + numeroCliente + " [" + nombre + "]";
    }
}
