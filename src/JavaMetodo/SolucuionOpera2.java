package JavaMetodo;

public class SolucuionOpera2 {
    public static void main(String[] args) {
        //Atributos
        int resultado = multiplicar(3,3);
        System.out.println("El resultado de la multiplicacion es: "+ resultado);
        //Metodo Float Dato flotante
        float resultado2 = Operaciones2.division(100,2);
        System.out.println("El resultado de esta division es: "+ resultado2);

        float resultado3 = Operaciones2.sumar(5,5,5);
        System.out.println("El resultado de esta suma es: "+ resultado3);

    }
    // Metodo Private
    private static int multiplicar(int va1, int va2){
        return va1*va2;
    }

}
