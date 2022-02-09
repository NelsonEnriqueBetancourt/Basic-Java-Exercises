package PracticeJava.Exercise1.Clases;

 public class Persona {

        // Atributos
        String nombre;
        String color;
        int edad;

        //Metodo constructor
        public Persona (String n, String c, int e){
            this.nombre = n;
            this.color = c;
            this.edad = e;
        }

        //Metodo GETTER

        public String getNombre() {
            return nombre;
        }
        public String getColor(){
            return color;
        }
        public int getEdad(){
            return edad;
        }

        //Metodo SETTER
        public void setNombre(String n){
            this.nombre= n;
        }
        public void setColor(String c){
            this.color = c;
        }
        public void setEdad(int e){
            this.edad= e;
        }

        //Metodo Mostrar info Persona
        public void motrarinfo(){
            System.out.println("La Informacion de la persona es: ");
            System.out.println("el nombre que tiene es :"+ getNombre());
            System.out.println("el color que tiene es :" + getColor());
            System.out.println("edad que tiene :"+ getEdad());

        }


 }
