package Challengetopic1.Exercise3.Decorador;

import Challengetopic1.Exercise3.Clases.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("** BIENVENIDOS COMIDAS RAPIDAS **");
        System.out.println(" MENU CARRITO DE HOT DOG: \n");

        Perro_Caliente perro_caliente= new Perro_Caliente();

        int eleccion;

        do {
            System.out.println((+1)+".Con su Hot Dog seleccione sus adicionales: \n");
            System.out.println((+2)+".** Adicionales **: "+"\n1 salsas. \n2 papitas trituradas. \n3 piña en trozos. \n4 tocineta. \n5 Terminar.\n");
            System.out.println((+3)+".Cual Adicional quieres añadir: 1|2|3|4|5");
            eleccion=entrada.nextInt();

            switch (eleccion){

                case 1 :
                    perro_caliente = new Salsas(perro_caliente);
                    break;
                case 2 :
                    perro_caliente= new Papitas_Trituradas(perro_caliente);
                    break;
                case 3 :
                     perro_caliente = new Piña_trozos(perro_caliente);
                    break;
                case 4 :
                    perro_caliente= new Tocineta(perro_caliente);
                    break;
                case 5 :
                    break;

                default:
                    System.out.println("Opcion no valida");
            }


        }while (eleccion !=5);

        System.out.println("");
        System.out.println("Entregando...");
        System.out.println(perro_caliente.getDescripcion());
        System.out.println("BUEN PROVECHO.!!!");

    }
}
