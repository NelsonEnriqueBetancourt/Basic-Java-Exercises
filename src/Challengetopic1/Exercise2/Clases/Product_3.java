package Challengetopic1.Exercise2.Clases;

import Challengetopic1.Exercise2.Interfaces.Producto;

import javax.swing.*;

public class Product_3 extends Store_linea implements Producto {

    private String name="Yuca";
    private float price=0;

    public Product_3( int codiProducto) {
        super(codiProducto);
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }


    @Override
    public void Tipo_Producto() {
        System.out.println("producto 3:\n"+"Nombre "+getName()+"\nprecio: "+getPrice()+"\nel codigo es: "+codiProducto);

        if (price != 0){
            if (price >= 0){
                JOptionPane.showInputDialog(Product_3.this,"Modificacion del precio");
            }
        }else {
            System.out.println();
            System.out.println("El Precio No ha sido cambiado:  "+" Precio " +price);
        }
    }
}
