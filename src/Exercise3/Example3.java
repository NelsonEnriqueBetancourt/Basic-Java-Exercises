package Exercise3;

import java.util.Scanner;

  public class Example3 {
      public static void main(String[] args) {
            String nombre ="";
            int edad = 0;

            Scanner Persona = new Scanner(System.in);
            System.out.println("ingrese el nombre");
            nombre = Persona.next();
            System.out.println("Ingrese Edad");
            edad = Persona.nextInt();

            if (edad >=18){
                System.out.println("El nombre es: " + nombre + "(Mayor)");
            }
            else {
                System.out.println("el nombre es: " + nombre + " menor de edad no (puede votar)" );
            }
      }
  }



