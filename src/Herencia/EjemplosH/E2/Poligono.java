package Herencia.EjemplosH.E2;

public abstract class Poligono {
    protected int numeroLados;


    public Poligono(int numeroLados){
        this.numeroLados=numeroLados;

    }

    public int getNumeroLados(){
        return numeroLados;
    }

    public abstract double area();


    public String toString(){
        return "Numero de Lados: "+numeroLados;
    }


}
