package Herencia.EjemplosH.E2;

public class Rectangulo extends Poligono{

    private float lado1;
    private float lado2;

    public Rectangulo(int numeroLados, float lado1, float lado2){
        super(numeroLados);
        this.lado1=lado1;
        this.lado2=lado2;
    }

    public float getLado1(){
        return lado1;
    }
    public float getLado2(){
        return lado2;
    }

    //sobre-escribimos el metodo abstracto de la clase padre
    @Override
    public double area(){
        return lado1*lado2;
    }

    @Override
    public String toString(){
        return "Rectangulo: "+super.toString()+" lado 1: "+lado2+" lado 2: "+lado2;
    }
}
