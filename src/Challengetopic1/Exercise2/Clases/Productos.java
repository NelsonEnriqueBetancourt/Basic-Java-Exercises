package Challengetopic1.Exercise2.Clases;

import Challengetopic1.Exercise2.Interfaz.Observador;

import javax.swing.*;
import java.util.ArrayList;

public class Productos  implements Observador{

    private String nombre;
    private int precio;

    private ArrayList<Observador> observadores = new ArrayList<>();

    public Productos(String nombre, int precio){

        this.nombre=nombre;
        this.precio=precio;

    }


    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void Agregar(Observador o) {
        observadores.add(o);
    }

    @Override
    public void quitar(Observador o) {
        observadores.remove(o);

    }

    @Override
    public void actualizar() {
        for(Observador o : observadores){
            o.actualizar();
        }

    }

    public void setPrecio(int precio) {
        this.precio = precio;
        this.actualizar();
        System.out.println("\nProducto: "+getNombre()+"\nSe modifico el precio: "+precio);

        if (precio != 0){
            if (precio >= 0){
                JOptionPane.showInputDialog("Producto: "+this.getNombre()+" Nuevo Precio valor: $"+precio);

            }

        }else {
            System.out.println();
            System.out.println("El Precio No ha sido cambiado:  "+" Precio " +precio);
        }

    }

}
