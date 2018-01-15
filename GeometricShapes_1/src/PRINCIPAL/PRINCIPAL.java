package PRINCIPAL;

import LOGICA.circulo;
import LOGICA.cuadrado;
import LOGICA.rectangulo;
import LOGICA.triangulo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PRINCIPAL {
     static int op=0, res=0;
     static float rest=0;
     static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
     public static void main (String arg[]) throws IOException {
        while (true){
        System.out.println("Seleccione una opción");
        menu();
        op=Integer.parseInt(entrada.readLine());
        
        switch(op){
            case 1://Cuadrado
                cuadrado cua=new cuadrado();
                System.out.println("Digite el tamaño del lado");
                cua.setLado(Integer.parseInt(entrada.readLine()));
                res=cua.areaCuadrado();
                System.out.println("El area del cuadrado es:"+res);
                cua.perimetroCuadrado();
                break;

            case 2://Triangulo
                triangulo tr=new triangulo();
                System.out.println("Digite el tamaño del lado");
                tr.setLado(Integer.parseInt(entrada.readLine()));
                System.out.println("Digite el tamaño de la altura");
                tr.setAltura(Integer.parseInt(entrada.readLine()));
                res=tr.areaTriangulo();
                System.out.println("El area del triangulo es:"+res);
                tr.perimetroTriangulo();
                break;

            case 3://Rectangulo
                rectangulo rec=new rectangulo();
                System.out.println("Digite el tamaño de la base");
                rec.setBase(Integer.parseInt(entrada.readLine()));
                System.out.println("Digite el tamaño de la altura");
                rec.setAltura(Integer.parseInt(entrada.readLine()));
                res=rec.areaRectangulo();
                System.out.println("El area del rectangulo es:"+res);
                rec.perimetroRectangulo();
                break;

            case 4://Circulo
                circulo cir=new circulo();
                System.out.println("Digite el tamaño del radio");
                cir.setRadio(Integer.parseInt(entrada.readLine()));
                rest=cir.areaCirculo();
                System.out.println("El area del Circulo es:"+res);
                cir.perimetroCirculo();
                System.out.println("El perímetro del Circulo es:"+res);

                break;
                
            case 5://Salir
                System.exit(0);
                System.out.println("");
                break;
            
        }
        }
    }


    public static void menu () {

        System.out.println("1. Cuadrado \n2. Triangulo \n3. Rectangulo \n4. Circulo \n5 Salir");
    }

}

