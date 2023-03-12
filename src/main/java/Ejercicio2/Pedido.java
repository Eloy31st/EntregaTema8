package Ejercicio2;

import java.util.ArrayList;

public class Pedido {
    private Clientes cliente;
    private ArrayList<Obra> obras;

    public Pedido(Clientes cliente, ArrayList<Obra> obras) {
        this.cliente = cliente;
        this.obras = obras;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public String getObras() {
        String obrasString = "";
        for (Obra obra : obras) {
            obrasString += "-" + obra.toString() + "\n";
        }
        return obrasString;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }


    public void agregarObra(Obra obra) {
        obras.add(obra);
    }

    @Override
    public String toString() {
        return "Pedido n.°" + cliente.getNumeroCliente() + " de " + cliente.getNombre()+ ":\n" + getObras() ;
    }
}
