package Principal;

import Logica.Vector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
    
    static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in)) ;
    static Boolean verificador = false;
    public static void main (String args[]) throws IOException {
       int op;
       Vector v= new Vector();
       System.err.println("Digite tamaño del vector que desea crear:/n");
       int length =Integer.parseInt(entrada.readLine());
       int vect[]= new int[length];
       
       menu();
       do{
       System.out.println("Seleccione una opcion");
       op=Integer.parseInt(entrada.readLine());
       switch(op){
           case 1: capturaDato();
               verificador = true ;
               break;
           case 2: if (verificador = true)
                v.ordenarVector(vect);
           else 
               System.out.println("El vector está vacio.");
           break;
           case 3: if (verificador=true)
               v.sumatoriaVector(vect);
           else
               System.out.println("El vector está vacio.");
           break;
           case 4: if (verificador = true)
               v.promedioVector(vect);
           else
               System.out.println("El vector está vacio.");
           break;
           case 5: if (verificador = true)
               v.numMayor(vect);
           else
               System.out.println("El vector está vacio.");
           break;
           case 6:if (verificador = true)
               v.numMenor(vect);
           else
               System.out.println("El vector está vacio.");
           break;
           case 7:v.imprimirVector(vect);
               break;
           case 8:System.exit(0);
               break;
       }
    }while(op<=8);
    }    
    public static void menu () {
       System.out.println(" 1.Capturar datos\n 2.Ordenar datos\n 3.Sumatoria\n 4.Promedio\n 5.Numero mayor\n 6.Numero menor\n 7.Imprimir vector\n 8.Salir");
    }
    public static void capturaDato () throws IOException {
        int num;
        for(int i=0;i<=4;i++){
          System.out.println("Digite un numero para el vector en la posición: " + i);
          num=Integer.parseInt(entrada.readLine());
          vect[i]=num;
        }
    }
}