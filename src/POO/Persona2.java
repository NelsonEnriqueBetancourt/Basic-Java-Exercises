package POO;

//sobre carga de metodos en una clase-- se refiere a la cantidad de metodos que se pongan

public class Persona2 {
    //attribute
    String nombre;
    int edad;
    String genero;

    //METHODS

    //method constructor 1
    public Persona2(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    //method constructor 2
    public Persona2(String genero){
        this.genero=genero;
    }

    /*teniendo en cuenta que el method mostrarInfo se diferencia entre el argumento de cada 1 con eso se logra diferenciar que
     tipo de constructor quiere mostrar o que tipo de attribute*/

    //method mostrar informacion del objeto
    public void mostrarInfo(){// argumento 1
        System.out.println((1)+".Mi nombre es "+nombre+" tengo "+edad+" años y Estoy comiendo un Helado");//method accion de una persona
    }
    public void mostrarInfo(int km){//argumento 2 especificar constructor 2
        System.out.print(" recorri "+km+" Kilometros");
    }

    //Creamos el objeto de la clase Persona
    public static void main(String[] args) {
        Persona2 p1 = new Persona2("Luis",21);
        p1.mostrarInfo();
        Persona2 p2 = new Persona2("Masculino");
        p2.mostrarInfo(100);

    }

}
