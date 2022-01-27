package JavaMetodo;

public class Metodos {
    public static void main(String[] args) {
        int resultado = sumar (2,4);
        int resultado2 = sumar2 (5, 5);
        System.out.println("El resultado de la suma  es: " + resultado);
        System.out.println("el resultado de la suma es: "+ resultado2);

        float res3 = Operaciones.multipicacion(5,5);
          System.out.println("El resultado de la multiplicacion es: " + res3);
    }

    private static int sumar (int varX, int varY){
            return varX + varY;
    }

    private static int sumar2 (int va1, int va2){
        return va1 * va2;
    }


}
