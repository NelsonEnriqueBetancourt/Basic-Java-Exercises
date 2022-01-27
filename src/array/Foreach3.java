package array;

import java.util.Scanner;

public class Foreach3 {
    public static void main(String[] args) {
        //Scanner
        Scanner Entrada =new Scanner(System.in);
        //array
        int [] tabla1 = new int[12];
        int [] tabla2 = new int[12];
        int [] tabla3 = new int[24];

        //cycle for
        System.out.println("Valores del primer arreglo: ");
        for (int i=0; i<12; i++){
            System.out.print((i+1)+".Digite el numero: ");
            tabla1[i]=Entrada.nextInt();
        }

        System.out.println();

        System.out.println("valores del segundo arreglo: ");
        for (int i=0; i<12; i++){
            System.out.print((i+1)+".Digite el numero:");
            tabla2[i]= Entrada.nextInt();
        }

        //combinar los 2 arreglos de y mostrarlas en en arreglo 3
        //utilizamos el iterador i para tabla1 y tabla2
        //utilizamos el iterador j para tabla3
        int j=0;
        for (int i=0; i<12; i++){
            tabla3[j]= tabla1[i];
            j++;
            tabla3[j]= tabla2[i];
            j++;
        }

        //see info for-each
        System.out.println("\n combinacion del arreglo 3: ");
        for(int i=0; i<24; i++){
            System.out.println(tabla3[i]+"");
        }
        System.out.println();
    }
}
