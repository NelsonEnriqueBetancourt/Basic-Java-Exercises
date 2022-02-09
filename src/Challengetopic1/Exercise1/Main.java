package Challengetopic1.Exercise1;

import Challengetopic1.Exercise1.Clases.Disco_Muisc2;
import Challengetopic1.Exercise1.Clases.Disco_Music1;

public class Main {
    public static void main(String[] args) {

        Disco_Music1 disc1 = new Disco_Music1("Mp3");
        disc1.Tipo_disco();
        System.out.println();

        Disco_Muisc2 disc2= new Disco_Muisc2("pop");
        disc2.Tipo_disco();

    }
}
