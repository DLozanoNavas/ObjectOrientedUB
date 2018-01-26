/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package nomina;

import Logic.Employee;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dlozanonavas
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    String input = System.console().readLine();

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Employee Employee = new Employee();
        ArrayList<Employee> EmployeeList = new ArrayList<>();
        ArrayList<Employee> EmployeeSelected = new ArrayList<>();
        int LegalMinSalary = 781242;
        int TransportAux = 81211;
        int EmployeeInitialCount = 0;
        float HealthDiscount = (float) 0.04;
        while (true) {
            System.out.println("1. Inscribir un empleado");
            System.out.println("2. Modificar un empleado");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Obtener totales");
            System.out.println("5. Salir");

            int option = Integer.parseInt(input.readLine());
            switch (option) {
                case 1:
                    System.out.println("Digite el nombre del empleado");
                    String EmployeeName = input.readLine();
                    Employee.setName(EmployeeName);

                    System.out.println("Digite el Apellido del empleado");
                    String EmployeeLastName = input.readLine();
                    Employee.setLastName(EmployeeLastName);

                    System.out.println("Digite el cargo del empleado");
                    String EmployeeJobPosition = input.readLine();
                    Employee.setJobPosition(EmployeeJobPosition);

                    System.out.println("Digite el salario básico del empleado");
                    int EmployeeBasicSalary = Integer.parseInt(input.readLine());
                    Employee.setBasicSalary(EmployeeBasicSalary);

                    System.out.println("Digite el número de horas extras trabajadas por el empleado");
                    int EmployeeExtraHours = Integer.parseInt(input.readLine());
                    int EmployeeExtraHoursPayment = EmployeeExtraHours * ((EmployeeBasicSalary / 30) / 4);
                    Employee.setExtraHoursPayment(EmployeeExtraHoursPayment);

                    System.out.println("Digite el valor de las comisiones del empleado");
                    int EmployeeCommissions = Integer.parseInt(input.readLine());
                    Employee.setCommissions(EmployeeCommissions);

                    if (Employee.hasTransportAux(Employee, LegalMinSalary)) {
                        Employee.setTansportAux(TransportAux);
                        int totalAcquired = EmployeeBasicSalary + EmployeeExtraHoursPayment + EmployeeCommissions + TransportAux;
                        Employee.setTotalAcquired(totalAcquired);
                    } else {
                        Employee.setTansportAux(0);
                        int totalAcquired = EmployeeBasicSalary + EmployeeExtraHoursPayment + EmployeeCommissions;
                        Employee.setTotalAcquired(totalAcquired);
                    }

                    int HealthWithdraw = (int) (EmployeeBasicSalary * 0.04);
                    Employee.setHealthWithdraw(HealthWithdraw);

                    int PensionWithdraw = (int) (EmployeeBasicSalary * 0.04);
                    Employee.setPensionWithdraw(PensionWithdraw);

                    EmployeeList.add(EmployeeInitialCount, Employee);
                    EmployeeInitialCount++;
                    break;
                case 2:
                    for (Employee employee : EmployeeList) {
                        System.out.println("Nombre: "+employee.getName());
                        System.out.println("Apellido: "+employee.getLastName());
                        System.out.println("Cargo: "+employee.getJobPosition());
                        System.out.println("Salario básico: "+employee.getBasicSalary());
                        System.out.println("Pago de horas extra: "+employee.getExtraHoursPayment());
                        System.out.println("Auxilio de transporte: "+employee.getTransportAux());
                        System.out.println("Descuento de pensión:"+employee.getPensionWithdraw());
                        System.out.println("Descuento por salud y seguridad social: "+employee.getHealthWithdraw());
                        System.out.println("Total devengado: "+employee.getTotalAcquired());
                    }
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("Bye!");
                    break;
            }
        }
    }

    public Employee SearchEmployee(ArrayList<Employee> EmployeeList, int BasicSalary) {
        Employee EmployeeKey = new Employee();
        return EmployeeKey;
    }
}
