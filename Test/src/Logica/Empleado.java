/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author dlozanonavas
 */
public class Empleado {

    String cargo;
    String nombreEmpleado;
    double sueldo;
    int numHorasExtras;
    double comisiones;
    double auxilioTrasporte;
    double totalDevengado;
    double porcSalud = 0;
    double porcPension;
    double totalDeducciones;
    double netoPagado;
    double preSueldo = 0;
    double preDevengado = 0;
    double valorHorasExtras;
    int numEmpleados;

    public void setNombre(String val) {
        nombreEmpleado = val;

    }

    public void setCargo(String val) {
        cargo = val;

    }

    public void setSueldo(double val) {
        sueldo = val;

    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setHorasExtras(int val) {
        this.numHorasExtras = val;
    }

    public double getPagoHorasExtras(int val) {
        return this.numHorasExtras * ((this.sueldo/30)/4);
    }
}
