package Challengetopic1.Exercise2.Clases;

import Challengetopic1.Exercise2.Interfaz.Observador2;

public class Clientes implements Observador2 {

    protected String nombre;


    public Clientes(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void Actualizar1(Productos A) {
        System.out.println("Nuevo Cliente: "+this.getNombre());
        System.out.println("El producto es: "+A.getNombre()+" nuevo precio es: "+ A.getPrecio());

    }
}
