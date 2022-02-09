package challengetopic0;

/*  un  ArrayList nos permiten añadir, eliminar y modificar elementos. y para agregar un elemento se utiliza la palabra reservada
     --add--
    la matriz sea tipo string y como agregar valores de tipo entero dentro de ella
*/


public class Main {

    public static void main(String[] args) {

        int [][] matriz= new int [20][10];

        //
        System.out.println("Memory");
        for (int i=0; i<20; i++){
            for (int x=0; x<10; x++){
               System.out.print("**** ");

            }
            System.out.println();
        }


        System.out.println("Memory cs");
        for (int i=0; i<20; i++){
            for (int x=0; x<10; x++){
                System.out.print("**** ");

            }
            System.out.println();
        }

    }
}
