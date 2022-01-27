package array;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Scanner
        Scanner Entrada = new Scanner(System.in);
        //array
        int [] number = new int[10];
        //Variables
        boolean creciente = false, decreciente= false;
        //llenar el arreglo
        System.out.println("Llenar el arreglo: ");
        //cycle for
        for (int i=0; i<10; i++){
            System.out.print((i+1)+".digite el numero: ");
            number[i]=Entrada.nextInt();
        }

        for (int i=0; i<9; i++){
            if (number[i] < number[i+1]){// creciente 1,2,3,4...10
                creciente = true;
            }
            if (number[i]> number[i+1]){//decreciente 5,4,3...1
                decreciente=true;
            }
        }

        if (creciente== true && decreciente==false){
            System.out.println("\nel arreglo es de forma creciente");
        }
        else if (creciente==false && decreciente==true){
            System.out.println("\n el arreglo es de forma decreciente");
        }
        else if (creciente== true && decreciente==true){
            System.out.println("\n el arreglo esta desordenado");
        }

        if (creciente==false && decreciente==false){
            System.out.println("\n el arreglo es igual");
        }
        System.out.println();
    }
}
