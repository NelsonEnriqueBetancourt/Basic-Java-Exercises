package Challengetopic1.Exercise1.Clases;

import Challengetopic1.Exercise1.conexion.Interface;

public class Reproductores implements Interface {

    public Reproductores(){
        Personalizar();
    }

    @Override
    public String getnombre() {
        return nombre;
    }

    @Override
    public void Personalizar() {
        System.out.println("El Producto es un: "+getnombre()+"\n Tiene estas caracteristicas: ");

    }

}
