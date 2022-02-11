package Challengetopic1.Exercise4Ejemplo.Clases;

import Challengetopic1.Exercise4Ejemplo.Interfaces.Producto;

import javax.swing.*;

public class Product_1 extends Store_linea implements Producto {
    private String name="Cofee";
    private float price=0;

    public Product_1( int codiProducto){
        super(codiProducto);
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }


    @Override
    public void Tipo_Producto(){
        System.out.println("producto 1:\n"+"Nombre "+getName()+"\nprecio: "+getPrice()+"\nel codigo es: "+codiProducto);

        if (price != 0){
            if (price >= 0){
                JOptionPane.showInputDialog(Product_1.this,"Modificacion del precio");

            }

        }else {
            System.out.println();
            System.out.println("El Precio No ha sido cambiado:  "+" Precio " +price);
        }


    }

}
