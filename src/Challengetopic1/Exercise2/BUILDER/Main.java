package Challengetopic1.Exercise2.BUILDER;

import Challengetopic1.Exercise2.Clases.Clientes;
import Challengetopic1.Exercise2.Clases.Productos;

public class Main {
    public static void main(String[] args) {

        System.out.println("STORE LINEA Y SUS VENTAS: ");
        System.out.println();

        Productos A1 = new Productos("ZAPATILLAS NIKE",20000);
        Productos A2 = new Productos("ZAPATILLAS ADIDAS",30000);
        Productos A3 = new Productos("ZAPATILLAS PUMA",25000);

        Clientes C1 =new Clientes("RAMON");
        Clientes C2 =new Clientes("CIELO");
        Clientes C3 =new Clientes("JORGE");

        C1.Actualizar1(A1);
        System.out.println();
        C2.Actualizar1(A2);
        System.out.println();
        C3.Actualizar1(A3);
        System.out.println();

        //System.out.println("Observaciones: ");
        // A1.setPrecio(3000);
        // System.out.println();

    }
}
