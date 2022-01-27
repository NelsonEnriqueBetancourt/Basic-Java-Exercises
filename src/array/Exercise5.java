package array;


import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //Scanner
        Scanner Entrada = new Scanner(System.in);
        //variables
        int conteo_par=0, conteo_impar=0;

        //Array
        int [] tabla1= new int[10];

        System.out.println("Ingrese los numeros del arreglo: ");
        for (int i=0; i<10; i++){
            System.out.print((i+1)+".Ingrese numero ");
            tabla1[i]=Entrada.nextInt();

            if (tabla1[i] % 2==0){// si el numero es par
                conteo_par++; // el numero es par aumente de 1 en 1
            }else {
                conteo_impar++;
            }
        }

        //almacenamos los numeros pares e impares en su arreglo
        int [] tabla2= new int[conteo_par];//arreglo almacenar numeros pares
        int [] tabla3= new int[conteo_impar];// arreglo almacenar numeros impares

        conteo_par=0;
        conteo_impar=0;

        for (int i=0; i<10; i++){
            if (tabla1[i] %2 ==0){
                tabla2[conteo_par] = tabla1[i];
                conteo_par++;
            }
            else {  // si el numero es impar
                tabla3[conteo_impar]= tabla1[i];
                conteo_impar++;
            }
        }
        System.out.println();

        System.out.println("Arreglo Pares");
        for (int i=0; i<conteo_par; i++){
            System.out.print(tabla2[i]+"-");
        }

        System.out.println();

        System.out.print("Arreglo Impares");
        System.out.println();
        for (int i=0; i<conteo_impar; i++){
            System.out.print(tabla3[i]+"-");
        }
        System.out.println();

    }
}
