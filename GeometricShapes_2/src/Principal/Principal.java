package Principal;

import Logica.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



//System.in.Scanner
public class Principal {

   static int op=0;
   static BufferedReader entrada=new BufferedReader (new InputStreamReader(System.in));
    public static void main (String arg[]) throws IOException {
        menu();
        System.out.println("Seleccione una opción a continuación:");

        op =Integer.parseInt(entrada.readLine());
        switch(op){
            case 1://Cuadrado
                Cuadrado cu=new Cuadrado();
                cu.areaCuadrado();
                cu.perimetroCuadrado();
                break;
            case 2://Triangulo
                Triangulo tr=new Triangulo();
                tr.areaTriangulo();
                tr.perimetroTriangulo();
                break;
            case 3://Rectangulo
                Rectangulo rec=new Rectangulo();
                rec.areaRectangulo();
                rec.perimetroRectangulo();
                break;
            case 4://Circulo
                Circulo cir=new Circulo();
                cir.areaCirculo();
                cir.perimetroCirculo();
                break;
            case 5://salir
                System.exit(0);
                break;
        }
    }


    

    public static void menu () {
        System.out.println("1. Cuadrado \n2.Triangulo \n3.Rectangulo \n4. Circulo \n5.Salir");
    
    }

    

}

