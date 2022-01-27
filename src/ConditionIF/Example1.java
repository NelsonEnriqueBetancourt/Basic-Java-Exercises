package ConditionIF;
public class Example1 {
    public static void main(String[] args) {
        // variables
        int number1= 50;
        int number2= 90;

        // condition
        if (number1 >= number2){
            System.out.println("El numero es mayor");
            if (number1==number2){
                System.out.println("el numero "+number1+ " y " +number2+"son iguales");
            }else{
                System.out.println("El numero "+number1+" es mayor al numero "+number2+"" );
            }
        }
        else {
            System.out.println("El numero "+number2+" es mayor que numero "+number1+"");
        }
    }
}
