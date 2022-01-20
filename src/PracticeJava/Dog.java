package PracticeJava;

    public class Dog {

      //Atributos
        String nombre;
        String color;
        String raza;
        String e;

        //Metodo Constructor
        public Dog (String n, String c, String r, String e ){
            this.nombre= n;
            this.color= c;
            this.raza= r;
            this.e = e;
        }

        //Metodo GETTER
        public String getNombre(){
            return nombre;
        }

        public String getColor() {
            return color;
        }

        public String getRaza(){
            return raza;
        }

        public String getEdad() {
            return e;
        }

        //Metodo SETTER
        public void setNombre(String n){
            this.nombre = n;
        }

        public void setColor(String c) {
            this.color = c;
        }

        public void setRaza(String r){
            this.raza = r;
        }

        public void setEdad(String e){
            this.e = e;
        }

        public void mostrarInfo(){
            System.out.println("La informcacion del Dog Es: ");
            System.out.println("El Nombre es: "+ getNombre());
            System.out.println("El Color  es: "+ getColor());
            System.out.println("La Raza  es: "+ getRaza());
            System.out.println("La Edad  es: "+ getEdad());


        }

    }
