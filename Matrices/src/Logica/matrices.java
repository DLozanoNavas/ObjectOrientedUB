/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner
/**
 *
 * @author FATeams
 */
public class matrices {

    BufferedReader input=new BufferedReader(new InputStreamReader(System.in)) ;


    public void specsMDA(){



    }
    public int[][] getInput () throws IOException {
        System.out.println("Digite el número de columnas: ");

        columns=Integer.parseInt(input.readLine());

        System.out.println("Digite el número de columnas: ");
        rows=Integer.parseInt(input.readLine());

        int[][] items = new int[columns][rows];
        //System rows = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        for(int rows = 0; rows< items.length; rows++){
              for(int col = 0 ;col< items[rows].length; columns++){
                  System.out.println("Ingresa los elementos de la matriz para la parte ["+columns+"],["+rows+"]");
                  items[columns][rows] = (int)input.nextInt();
               } System.out.println();
        }

        for(int rows = 0; row< items.length; row++){
            for(int col = 0 ;col< items[rows].length; col++){
                System.out.println(items[rows][columns]);
            }
        System.out.println();
        }
    return items;
    }

    public void addMDAs(int items[][]){

    }

    public void multiplicateMDAs(int items[][]){

    }


    public boolean palindroms(){
        System.out.println("Ingrese una cadena de caracteres para comprobar si se trata de un palindromo: ");
        //Char [][]

    }




}



