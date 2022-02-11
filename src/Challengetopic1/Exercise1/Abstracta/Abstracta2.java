package Challengetopic1.Exercise1.Abstracta;

public abstract class Abstracta2 {
    public String nombre;
    public String color="Red";
    public int capacity=8;
    public int battery=5;

    public String getNombre(){
        return nombre;
    }

    public void Personalizar2(){
        System.out.println("El Reproductor es un: "+getNombre()+"\nTiene estas caracteristicas: ");
        System.out.println("\nEl color es: "+color+"\nla capacidad es: "+capacity+"\nla bateria es: "+battery);
    }

    public abstract void Despedirse();

}
