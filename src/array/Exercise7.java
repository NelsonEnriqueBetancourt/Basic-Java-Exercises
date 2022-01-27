package array;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //Scanner
        Scanner Entrada = new Scanner(System.in);
        //array
        int [] table1 = new int[10];
        int [] table2 = new int[10];
        int [] table3 = new int[20];
        //variable
        int j=0;
        int numero;

        //cycle for
        System.out.println("Datos del arreglo 1: ");
        for (int i=0; i<10; i++){
            System.out.print((i+1)+".Digite un Numero Entero: ");
            table1[i]=Entrada.nextInt();
        }
        System.out.println();

        System.out.println("Datos del arreglo 2: ");
        for (int i=0; i<10; i++){
            System.out.print((i+1)+".Digite un numero Entero: ");
            table2[i]=Entrada.nextInt();
        }
        System.out.println();

        //union entre arreglos
        //el iterardor el arreglo 3 es j

        for (int i=0; i<10; i++){
            table3[j]=table1[i];
            j++;
            table3[j]=table2[i];
            j++;
        }

        //imprimir datos del arreglo 3
        System.out.println("Datos del arreglo 3: ");
        for (int i=0; i<20; i++){
            System.out.print(table3[i]+"-");
        }
        System.out.println();

        // buscar numero entre un arreglo e indicar si existe y mostra en que posicion se encuentra
        //
        System.out.println("Ingrese el numero de busqueda: ");
        numero=Entrada.nextInt();

        //variable
        int i=0;

        //cyclo while
         while(i<10 && table3[i] < numero){
             i++;
         }
         if (i==20){
             System.out.println("numero no encontrado :(");
         }else {
             if (table3[i]==numero){
                 System.out.println("Numero encontrado, en la posicion "+i+" :)");

             }else {
                 System.out.println("numero no encontrado");
             }
         }
    }
}
