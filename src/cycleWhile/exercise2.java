package cycleWhile;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        //variables
        int number;
        int suma=0;//contador

        //Scanner
        Scanner sc = new Scanner(System.in);

        //do-while
        do {
            System.out.println("Ingrese numero: ");
            number= sc.nextInt();
            suma+=number;
        }while (number !=0);
        System.out.println("el registro de datos ingresados "+suma);
    }
}
