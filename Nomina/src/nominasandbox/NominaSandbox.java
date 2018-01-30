/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominasandbox;

import Logica.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dlozanonavas
 */
public class NominaSandbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner entrada = new Scanner(System.in);
        Empleado Empleado = new Empleado();
        ArrayList<Empleado> ListaDeEmpleados = new ArrayList();

        // Double[]vector= new Double[numEmpleados];
        do {

            System.out.println("Ingrese el cargo del empleado");
            String cargo = entrada.nextLine();
            Empleado.setCargo(cargo);

            System.out.println("Digite el nombre del empleado: ");
            String Nombre = entrada.nextLine();
            Empleado.setNombre(Nombre);

            //
            System.out.println("Ingrese el sueldo del empleado");
            double sueldo = (double) Integer.parseInt(entrada.nextLine());
            Empleado.setSueldo(sueldo);

            System.out.println("Ingrese el numero de horas extras del empleado");
            int HorasExtra = Integer.parseInt(entrada.nextLine());
            Empleado.setHorasExtras(HorasExtra);

            ListaDeEmpleados.add(Empleado);
            double sueldodelempleado = Empleado.getSueldo();
            sueldodelempleado += 1000000;
            Empleado.setSueldo(sueldodelempleado);
            // Muestra cada empleado en la Lista            
            for (Empleado empleado : ListaDeEmpleados) {
                System.out.println("El suedo del empleado es: " + Empleado.getSueldo());
            }

        } while (true);
    }
    
}
