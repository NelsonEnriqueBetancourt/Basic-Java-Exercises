package POO;

public class Operacion {

    public static void main(String[] args) {
        //attribute
        int result = suma (5,5,5);
        System.out.println("El resultado de la operacion es: "+ result);
        int result2 = dividir(50,4);
        System.out.println("El resultado de la operacion es:  "+ result2);

        //method float
        float result3 = OperationsExample3.Multiplicacion(9,3);
        System.out.println("El resultado de esta operacion es: "+ result3);
        float result4 = OperationsExample3.resta(99,84);
        System.out.println("El resultado de esta operacion es: "+ result4);
    }


    public class OperationsExample3 {
        public static float Multiplicacion(float va1, float va2){
            return va1*va2;
        }
        public static float resta(float va1, float va2) {
            return va1-va2;
        }

    }

    //method private hace parte de la clase Operacion por lo tanto se pone como atributo estatico

    private static int suma(int va1, int va2, int va3){
        return va1+va2+va3;
    }
    private static int dividir(int va1, int va2){
        return va1/va2;
    }
}
