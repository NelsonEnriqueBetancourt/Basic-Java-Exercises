package Challengetopic1.Exercise1.Abstracta;

public abstract class Abstracta {
    public String nombre;
    public String color="Blue";
    public int capacity=16;
    public int battery=8;


    public String getNombre(){
        return nombre;
    }

    public void Personalizar1(){

        System.out.println("El Reproductor es un: "+getNombre()+"\nTiene estas caracteristicas: ");
        System.out.println("\nEl color es: "+color+"\nla capacidad es: "+capacity+"\nla bateria es: "+battery);

    }

    public abstract void Despedirse();
}
