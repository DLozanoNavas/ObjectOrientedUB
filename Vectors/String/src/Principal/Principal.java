package Principal;

import Logica.Cadena;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
        static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in)) ;
        
    public static void main (String args[]) throws IOException{
        int op;
        Cadena cad= new Cadena();
        menu();
        do{
        System.out.println("Seleccione una opcion");
        op=Integer.parseInt(entrada.readLine());
        switch(op){
            case 1://Capturar
                cad.capturaDatos();
                break;
            case 2://Contar vocales
                cad.contarVocales();
                break;
            case 3://Contar caracteres
                cad.contarCaracteres();
                break;
            case 4://Contar repetidos
                cad.contarRepetidos();
                break;
            case 5://contar palabras
                cad.contarPalabras();
                break;
            case 6://Letra mayor
                cad.letraMayor();
                break;
            case 7://Letra menor
                cad.letraMenor();
                break;
            case 8://Imprimir
                cad.imprimirCadena();
                break;
            case 9://Salir  
                System.exit(0);
                break;
        }  
        }while(op<=9);
    }
    public static void menu () {
         System.out.println("Menu cadena");
         System.out.println("1.Capturar cadena\n2.Contar vocales\n3.Contar caracteres\n4.Contar repetidos\n5.Contar palabras\n6.Letra mayor\n7.Letra menor\n8.Imprimir cadena\n9.Salir");
    }
}

