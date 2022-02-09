package Challengetopic1.Exercise2;

import Challengetopic1.Exercise2.Clases.Product_1;
import Challengetopic1.Exercise2.Clases.Product_2;
import Challengetopic1.Exercise2.Clases.Product_3;

public class Main {
    public static void main(String[] args) {

        System.out.println("La informacion de los productos son: ");
        System.out.println();

        Product_1 articulo=new Product_1(202);
        articulo.Tipo_Producto();
        System.out.println();

        Product_2 articulo1=new Product_2(033);
        articulo1.Tipo_Producto();
        System.out.println();

        Product_3 articulo2=new Product_3(403);
        articulo2.Tipo_Producto();

    }
}
