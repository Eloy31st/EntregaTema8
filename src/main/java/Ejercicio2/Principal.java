package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int contadorClientes = 1;
        int contadorObras = 1;
        int tipo;
        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Obra> obras = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        while(opcion != 6){
            System.out.println("-- Menú --");
            System.out.println("1 - Mostrar clientes");
            System.out.println("2 - Crear clientes");
            System.out.println("3 - Crear una obra");
            System.out.println("4 - Crear un pedido");
            System.out.println("5 - Mostrar pedidos");
            System.out.println("6 - Salir");
            opcion = sc.nextInt();
            sc.skip("\n");
            switch (opcion) {
                case 1:
                    System.out.println("Lista de clientes:");
                    for (Clientes cliente : clientes) {
                        System.out.println(cliente);
                    }
                    break;
                case 2:
                    System.out.println("¿Nombre?");
                    String nombre = sc.nextLine();
                    clientes.add(new Clientes(nombre, contadorClientes));
                    System.out.println("Cliente nº " + contadorClientes + ": " + nombre + " añadido");
                    contadorClientes++;
                    break;
                case 3:
                    do {
                        System.out.println("¿Tipo?");
                        System.out.println("1 - Libro");
                        System.out.println("2 - Vídeo");
                        tipo = sc.nextInt();
                        sc.skip("\n");
                    } while (tipo != 1 && tipo != 2);
                    System.out.println("¿Título?");
                    String titulo = sc.nextLine();
                    System.out.println("¿Nombre del autor?");
                    String nombreAutor = sc.nextLine();
                    if (tipo == 1) {
                        System.out.println("¿Número de páginas?");
                        int numPaginas = sc.nextInt();
                        Libro libro = new Libro(titulo, nombreAutor,contadorObras, numPaginas);
                        obras.add(libro);
                        System.out.println(libro + " añadido");
                        contadorObras++;
                    } else if (tipo == 2) {
                        System.out.println("¿Duración (minutos)?");
                        int duracion = sc.nextInt();
                        Obra obra = new Video(titulo, nombreAutor,contadorObras, duracion);
                        obras.add(obra);
                        System.out.println(obra + " añadido");
                        contadorObras++;
                    }
                    break;
                case 4:
                    ArrayList<Obra> obrasPedido = new ArrayList<>();
                    int numCliente;
                    do {
                        System.out.println("¿Para qué cliente?");
                        for (Clientes cliente : clientes) {
                            System.out.println(cliente);
                        }
                        numCliente = sc.nextInt();
                    } while (numCliente < 1 || numCliente > clientes.size());
                    do {
                        System.out.println("¿Qué obra agregar al pedido?");
                        for (Obra obra : obras) {
                            System.out.println(obra.getNumeroObra() + "-" + obra);
                        }
                        System.out.println(obras.size() + 1 + " - Terminar pedido");
                        opcion = sc.nextInt();
                        if (opcion != obras.size() + 1) {
                            obrasPedido.add(obras.get(opcion - 1));
                        }
                    } while (opcion != obras.size() + 1);
                    pedidos.add(new Pedido(clientes.get(numCliente - 1), obrasPedido));
                    System.out.println("Pedido añadido");
                    break;
                case 5:
                    System.out.println("-- Pedidos --");
                    for (Pedido pedido : pedidos) {
                        System.out.println(pedido);
                    }
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
