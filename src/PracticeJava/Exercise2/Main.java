package PracticeJava.Exercise2;

import PracticeJava.Exercise2.Clases.Hijo;
import PracticeJava.Exercise2.Clases.Madre;
import PracticeJava.Exercise2.Clases.Papa;
import PracticeJava.Exercise2.Clases.Persona;

public class Main {
    public static void main(String[] args) {

        Persona personas [] = new Persona[4];

        personas[0]= new Papa("Felipe",40,"Padre","Conductor",1400000);
        personas[1]= new Madre("Maria", 35, "Madre", "Abogada", "Femenino", 1200000);

        personas[2]=new Hijo("Pepe", 20, "Hijo", "Programador", "Futbol",2000000);
        personas[3]=new Papa("Papa2",37,"Abuelo","No hago nada",300000 );


        for(Persona persona:personas){
            System.out.print(persona.toString());
            System.out.println();
        }

     }
}
