package Interfaz;

import Logic.Person;
import java.util.Scanner;


public class Main {

    static Scanner input= new Scanner(System.in);
    
    
    public Main () {
    
    
    }

    public static void main (String args[]) {
        int opc;
        Person P=new Person();
        menu();
        do{
            System.out.println("Seleccione una opcion");
            opc=input.nextInt();
           switch(opc){ 
               case 1://Guardar persona
                   P.savePerson();
                   break;
               case 2://Modificar persona
                   P.modifyPerson();
                   break;
               case 3://Imprimir persona
                   P.printPerson();
                   break;
               case 4://Buscar persona
                   P.searchPerson();
                   break;
               case 5://Salir
                   System.exit(0);
           }
        }
        while(opc<=5);
    }

    public static void menu () {
        System.out.println("Seleccione una opción del siguiente Menu:\n1. Guardar persona \n2. Modificar persona \n3. Imprimir \n4.  Buscar persona \n5. Salir ");
    }

}

