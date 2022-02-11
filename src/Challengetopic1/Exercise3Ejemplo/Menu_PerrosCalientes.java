package Challengetopic1.Exercise3Ejemplo;

import java.util.Scanner;

public class Menu_PerrosCalientes {

    public static void main(String[] args) {
        int preparacion;
        int eleccion = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("** BIENVENIDOS **");
        System.out.println(" MENU CARRITO DE PERROS: \n");
        System.out.println((+1)+".Perro Caliente Sencillo: \n"+"Ingredientes Perro sencillo : Salchicha "+"y"+" Pan \n");
        System.out.println((+2)+".Perro caliente al gusto, "+ "Adicionales: \n"+" salsas, papitas trituradas, piña en trozos, tocineta \n");
        System.out.println((+3)+".Que tipo de perro quieres pedir: 1|2 ");
        preparacion=entrada.nextInt();


        switch (preparacion) {
            case 1: System.out.println("Has elegido Perro caliente sencillo");
            break;
            case 2: System.out.println("Has Elegido Perro caliente al gusto: \n");
            break;
        }

        if (preparacion==1){
            System.out.println("Buen provecho !!");
            if (preparacion==2){

            }
        }else {
            System.out.println((+4)+".Los Adicionales Disponibles son : ");
            System.out.println("\n1 salsas. \n2 papitas trituradas. \n3 piña en trozos. \n4 tocineta. \n5 Con todo.  \n6 Papitas Trituradas,  tocineta, y piña en trozos." +
                    "\n7 Papitas Trituradas, y Piña en trozos. \n8 Papitas Trituradas, y tocineta. \n9 Piña en trozos y tocineta. \n10 Piña en trozos y Papitas Trituradas.\n");
            System.out.println((+5)+".Cual Adicional quieres añadir: 1|2|3|4|5|6|7|8|9|10");
            eleccion= entrada.nextInt();
        }

        switch (eleccion){

            case 1 : System.out.println("Bien, le agregaremos Salsas");
            break;
            case 2 : System.out.println("Bien, le agregaremos  Papitas Trituradas ");
            break;
            case 3 : System.out.println("Bien, le agregaremos  Piña en trozos ");
            break;
            case 4 : System.out.println("Bien, le agregaremos  tocineta ");
            break;
            case 5 : System.out.println("Bien, le agregaremos Salsas, Papitas Trituradas, Piña en trozos, y tocineta");
            break;
            case 6 : System.out.println("Bien, le agregaremos Papitas Trituradas,  tocineta, y piña en trozos ");
            break;
            case 7 : System.out.println("Bien, le agregaremos Papitas Trituradas, y Piña en trozos ");
            break;
            case 8 : System.out.println("Bien, le agregaremos Papitas Trituradas, y tocineta");
            break;
            case 9 : System.out.println("Bien, le agregaremos Piña en trozos y tocineta ");
            break;
            case 10 : System.out.println("Bien, le agregaremos Piña en trozos y Papitas Trituradas ");
            break;
        }   System.out.println("Buen provecho !!");

    }

}
