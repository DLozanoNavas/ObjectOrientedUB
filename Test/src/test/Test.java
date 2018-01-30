package Test;

import java.util.Scanner;
import java.util.ArrayList;
import Logica.Empleado;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empleado Empleado = new Empleado();
        ArrayList<Empleado> ListaDeEmpleados = new ArrayList();
        double salarioDelEmpleado = Empleado.getSueldo();

        ListaDeEmpleados.add(Empleado);

        // Double[]vector= new Double[numEmpleados];
        do {

            System.out.println("Ingrese el cargo del empleado");
            String cargo = entrada.nextLine();
            Empleado.setCargo(cargo);

            System.out.println("Digite el nombre del empleado: ");
            String Nombre = entrada.nextLine();
            Empleado.equals(Nombre);
            System.out.println("El suedo del emplepado es: " + Empleado.getSueldo());

            System.out.println("Ingrese el sueldo del empleado, sin comas ni puntos");
            double sueldo = (double) Integer.parseInt(entrada.nextLine());
            Empleado.setSueldo(sueldo);

            System.out.println("Ingrese el numero de horas extras del empleado");
            int HorasExtra = Integer.parseInt(entrada.nextLine());
            Empleado.setHorasExtras(HorasExtra);

        } while (true);
    }
}
