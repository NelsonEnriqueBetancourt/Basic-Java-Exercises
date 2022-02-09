package Herencia.Abstracto;

/*
  Creamos un objeto pero no de la clase abstracta Servivo, lo creamos en la clase Persona

  para llamar el metodo que tenemos en la clase que creamos el objeto es con "."

  "nombre_objeto.metodo"
 */

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();

        p1.alimentarse();


    }
}
