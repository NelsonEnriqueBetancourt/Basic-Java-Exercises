package POO;

public class Persona1 {
        //attributes
        private String firstname;
        private String lastname;
        private String gender;
        private String nationality;
        private int age;

        //method construction
    public Persona1(String name, String last, String gender, String nationality, String age ){
        this.firstname= name;
        this.lastname= last;
        this.gender= gender;
        this.nationality= nationality;
        this.age= Integer.parseInt(age);
    }
        //method G,S
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getGender(){
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge(){
        return age;
    }

    public void setFirstname(String name){
        this.firstname= name ;
    }
    public void setLastname(String last){
       this.lastname= last ;
    }
    public void setGender(String gender){
        this.gender= gender;
    }
    public void setNationality(String nation){
        this.nationality= nation;
    }

    public void setAge(int age) {
        this.age = age;
    }


       // mostrar info
    public void showInfo(){
        System.out.println("The data from person is: ");
        System.out.println("I am firstname is: "+ getFirstname());
        System.out.println("I am lastname is: "+ getLastname());
        System.out.println("my gender is: "+ getGender() );
        System.out.println("I am From is: "+ getNationality());
        System.out.println("I have " + getAge());
        System.out.println();

        if (age >=18){
            System.out.println("is old age "+ age);
        }
        else {
            System.out.println("is younger");
        }
    }

    //NUEVO OBJETO-- METODO MAIN-- imprimir desde la misma clase

   /* public static void main(String[] args) {
            Persona person1 = new Persona("Nelson","Betancourt","Masculino","Colombia","11");
            person1.showInfo();
    }*/
}

