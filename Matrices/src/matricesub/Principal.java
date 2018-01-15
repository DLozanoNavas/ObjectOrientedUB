/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricesub;

import Logica.matrices;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FATeams
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static BufferedReader input=new BufferedReader(new InputStreamReader(System.in)) ;
    public static void main (String args[]) throws IOException{

        int op;
        matrices multiDimentionalArray= new matrices();
        menu();
        do{
        System.out.println("Seleccione una opcion");
        option=Integer.parseInt(input.readLine());
        switch(option){
            case 1://Capturare input
                multiDimentionalArray.getInput();
                break;
            case 2://Multiplicate MDA's
                multiDimentionalArray.addMDAs();
                break;
            case 3://Multiplicate MDA's
                multiDimentionalArray.multiplicateMDAs();
                break;
            case 4://Check for palindroms
                multiDimentionalArray.palindroms();
        }
        }while(op<5);
    }

    public static void menu () {
         System.out.println("Menu cadena");
         System.out.println("1. Capturar datos\n2.Sumar Matriz\n3. Multiplicar Matriz\n4. Comprobar Palíndromos\n5. Salir");
    }
}




