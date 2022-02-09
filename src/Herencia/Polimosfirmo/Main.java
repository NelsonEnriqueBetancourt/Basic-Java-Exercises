package Herencia.Polimosfirmo;

/*
  Creamos el Objeto de la calse Vehiculos, como vamos a mostrar las clases de vehiculos entonces
  lo llenamos con un arreglo donde va almacenar la cantidad que tengamos en este caso 4

  polimosfirmo
  --funciona cuando creamos el objeto de la clase Vehiculo pero lo relacionamos con la clase hija
  en este caso VehiculoDeportivo e ingresamos los datos del metodo que tenga esta subclase

  se imprime con un for-each en el cual se pone-
  el nombre de la clase padre,  el nombre que le demos al for-each, el nombre del objeto a imprimir
 */
public class Main {
    public static void main(String[] args) {

        Vehiculo miVehiculo[]= new Vehiculo[4];

        miVehiculo[0]=new Vehiculo("Ferrari","2b","a15b");
        miVehiculo[1]=new VehiculoDeportivo("Toyota","22b","cv23",2000);
        miVehiculo[2]=new VehiculoFurgoneta("mazda","202b","23c",4000);
        miVehiculo[3]=new VehiculoTurismo(4, "chevrolet","467b","983cv");

        for(Vehiculo vehiculo :miVehiculo){
            System.out.println(vehiculo.mostInfo());
            System.out.println("");
        }

    }
}
