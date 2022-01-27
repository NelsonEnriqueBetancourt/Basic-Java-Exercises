package array;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {

        int [] number = new int[10];
        boolean creciente = true;
        int numero,sitio_numero=0,j=0;

        Scanner Entrada = new Scanner(System.in);
        System.out.println("el nuevo arreglo es: ");

        do {
            //llenando el arreglo
            for(int i=0; i<5; i++){
                System.out.print((i+1)+".Digite un numero: ");
                number[i]= Entrada.nextInt();
            }
            //comprobando que el arreglo esta ordenado crecientemente
            for (int i=0; i<4; i++){
                if (number[i] < number[i+1]){
                    creciente= true;
                }
                if (number[i] > number[i+1]){
                    creciente= false;
                    break;
                }
            }

            if (creciente == false){
                System.out.println("este arreglo no esta ordenado de forma creciente, vuelva a digitar un numero: ");
            }

        }while (creciente==false);

        System.out.println("Inserte un numero: ");
        numero= Entrada.nextInt();

        //esto es para darnos cuenta en que posicion va el numero
        while (number[j] <numero && j<5){
            sitio_numero++;
            j++;
        }

        //por ultimo, trasladamos una posicion en el arreglo a los elemnetos que van detras del numero
        for (int i=4 ;i >=sitio_numero;i--){
            number[i+1] = number[i];
        }
        // insertamos el numero que el usuario puso
        number[sitio_numero]= numero;

        System.out.println("el arreglo queda: ");
        for (int i=0; i<6; i++){
            System.out.print(number[i]+"-");
        }
        System.out.println();
    }
}
