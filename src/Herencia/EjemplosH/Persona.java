package Herencia.EjemplosH;

/*
  --   CLASE PERSONA ES: --
    -- LA CLASE PADRE --

    MODIFICADOR DE ACCESO SOLO PARA HERENCIA DE CLASES HIJAS
       --Protected--
     solo funciona tanto como en la clase padre  como en la clase hija y asi puede
     ser llamado el atributo de la clase padre "P" a la clase hija "E"
 */

public class Persona {
    //attribute
    private String nombre;
    private String apellido;
    private int edad;

    //METHODS
    //Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }


}
