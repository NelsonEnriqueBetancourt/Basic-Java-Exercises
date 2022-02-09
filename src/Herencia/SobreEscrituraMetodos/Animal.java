package Herencia.SobreEscrituraMetodos;

/* @Override = Funciona para SobreEscribir Metodos (en este caso SobreEscribimos metodo "comer")

  cuando creamos un objeto de la clase animal me va a leer este metodo que sobreescribi y no el metodo del cual estoy
  herendando en este caso " heredo el metodo de la clase persona"

  Ejemplo:
  un animal no come igual a una persona entonce por eso lo sobreescribi

 -- Si no ponemos el la palabra reservada --@Override-- no va a leer el metodo de la clase en la cual heredamos
    en este caso seria la Clase "Persona"
 */
public class Animal extends Persona{

    @Override
    public void comer() {
        System.out.println("Estoy comiendo en mi taza ");

    }
}
