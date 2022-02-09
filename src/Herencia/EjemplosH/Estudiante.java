package Herencia.EjemplosH;

/* ESTA CLASE ESTUDIANTE ES:
        SUBCLASE
        CLASE HIJA

   PORQUE HEREDA DE LA CLASE PADRE QUE ES:
         PERSONA

     COMO HACEMOS LA HERENCIA CON LA PALABRA CLAVE:
              Extends
      Ponemos el nombre de la clase que va a heredar:
              Persona

   palabra clave para llamar datos de la clase padre en el constructor de clase hija:
    "super(datos de los atributos que estan en clase padre)"
    poner atributos tanto como la clase padre "P" y clase hija "E"
 */

public class Estudiante extends Persona {
    //attributes
    private int codigo_estudiante;
    private float nota_final;

    //METHODS
    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int codigo_estudiante, float nota_final){
        super(nombre,apellido,edad);
        this.codigo_estudiante=codigo_estudiante;
        this.nota_final=nota_final;
    }

    public void mostraInfo(){
        System.out.println("El nombre es: "+getNombre()+ " Apellido: "+getApellido()+" Edad: "+getEdad()+
                " Codigo estudiante: "+codigo_estudiante+" Nota final: "+nota_final);


    }

}
