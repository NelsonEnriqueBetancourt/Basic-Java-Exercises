package Challengetopic1.Exercise1.Clases;

import Challengetopic1.Exercise1.Abstracta.Abstracta2;

public class Reproductor2 extends Abstracta2 {

    public Reproductor2(){
        DarNombre("DVD");
        Personalizar2();
        Despedirse();
    }

    @Override
    public void Despedirse() {
        System.out.println("Gracias por su compra");
    }

    public void DarNombre(String nombre){
        super.nombre=nombre;
    }
}
