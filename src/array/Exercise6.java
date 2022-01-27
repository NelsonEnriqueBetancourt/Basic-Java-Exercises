package array;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //Scanner
        Scanner Entrada = new Scanner(System.in);
        //variables
        boolean creciente=false;
        //Array
        int [] tabla1 = new int[10];
        int [] tabla2= new  int[10];
        int [] tabla3 = new int[20];

        System.out.println("ingrese los valores del arreglo");
        //for
        do {
            for (int i=0; i<10; i++){
                System.out.print((i+1)+".ingrese el entero");
                tabla1[i]=Entrada.nextInt();
            }

            for (int i=0; i<9; i++){
                if (tabla1[i]<tabla1[i+1]){
                    creciente=true;
                }
                if (tabla1[i]>tabla1[i+1]){
                    creciente=false;
                    break;
                }
            }

            if (creciente==false){
                System.out.println("el arreglo no es de forma creciente, digite otra vez un numero entero: ");
            }
        } while (creciente==false);

        System.out.println();

        System.out.println("ingrese los valores del arreglos 2: ");
        for (int i=0; i<10; i++){
            System.out.print((i+1)+".Digite el numero entero: ");
            tabla2[i]=Entrada.nextInt();
        }
        do {

          for (int i=0; i<9; i++){
            if (tabla2[i] < tabla1[i+1]){
                creciente=true;
            }
            if (tabla2[i]> tabla1[i+1]){
                creciente=false;
                break;
            }
          }

          if (creciente==false){
              System.out.println("el arreglo no es de forma creciente, digite otra vez un numero entero: ");
          }

        } while (creciente==false);

        System.out.println();

        //para los arreglos tabla1 y tabla2 el interador es i
        //para el arreglo 3 el iterador es j

        //UNION DE 2 ARREGLOS

        //NUEVA VARIABLE
        int j=0;

        //UNION DE 2 ARREGLOS
        for (int i=0;i<10; i++){
            tabla3[j]= tabla1[i];//1ªA, 2ªA...
            j++;
            tabla3[j]= tabla2[i];//1ªB, 2ªB..
            j++;
        }
        //imprimir en consola
        System.out.println("tercer arreglo, fusion: tabla1 y tabla2");
        for (int i=0; i<20; i++){
            System.out.print(tabla3[i]+" ");
        }
        System.out.println();
    }
}

