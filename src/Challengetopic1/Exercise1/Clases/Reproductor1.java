package Challengetopic1.Exercise1.Clases;

import Challengetopic1.Exercise1.Abstracta.Abstracta;

public class Reproductor1 extends Abstracta {

    public Reproductor1(){
        DarNombre("MP3");
        Personalizar1();
        Despedirse();
    }

    @Override
    public void Despedirse() {
        System.out.println("Gracias por su compra ");
    }

    public void DarNombre(String nombre){
       super.nombre=nombre;
    }



}
