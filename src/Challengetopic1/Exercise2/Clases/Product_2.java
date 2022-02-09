package Challengetopic1.Exercise2.Clases;

import Challengetopic1.Exercise2.Interfaces.Producto;

import javax.swing.*;

public class Product_2 extends Store_linea implements Producto {
     private String name="Papas";
     private float price=0;

     public Product_2(int codiProducto) {
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
          System.out.println("producto 2:\n"+"Nombre "+ getName() + "\nprecio: " + getPrice()+ "\nel codigo es: " + codiProducto);

          if (price != 0){
               if (price >= 0){
                    JOptionPane.showInputDialog(Product_2.this,"Modificacion del precio");
               }
          }else {
               System.out.println();
               System.out.println("El Precio No ha sido cambiado:  "+" Precio " +price);
          }

     }
}