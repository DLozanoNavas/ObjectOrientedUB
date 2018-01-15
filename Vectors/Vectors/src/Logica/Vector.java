package Logica;
import java.io.*;
import java.util.*;

public class Vector {

    public Vector () {
    }

    public void ordenarVector (int vect[]) {
        Arrays.sort(vect);
        System.out.printf("Vector Organizado de forma ascendente: %s", Arrays.toString(vect));
        System.out.println(" ");
        int last = vect.length - 1; 
        int middle = vect.length / 2; 
        for (int i = 0; i <= middle; i++) { 
            int temp = vect[i];
            vect[i] = vect[last - i]; 
            vect[last - i] = temp;
    
        }
        System.out.printf("Vector Organizado de forma descendente: %s", Arrays.toString(vect));
        System.out.println(" ");

    }

    public void sumatoriaVector (int vect[]) {
        int sum = 0;
        for (int num : vect){
        sum = sum+num;
        }
        System.out.println("La suma del vector es:"+sum);
    }

    public void promedioVector (int vect[]) {
        float prom;
        int sum = 0;
        for (int num : vect){
        sum = sum+num;
        }
        prom = sum/vect.length;
        String.format("%3f",prom);
        System.out.println("El promedio de los datos ingresados en el vector es: " + prom);
    }

    public void numMayor (int vect[]) {
        Arrays.sort(vect);
        System.out.println("El mayor valor del vector es: " +vect[vect.length-1]);
    }

    public void numMenor (int vect[]) {
        Arrays.sort(vect);
        System.out.println("El menor valor del vector es: " +vect[0]);
    }
    public void imprimirVector(int vect[]){
        for(int i=0;i<=vect.length;i++){
            System.out.println(vect[i]);
        }
    }
}