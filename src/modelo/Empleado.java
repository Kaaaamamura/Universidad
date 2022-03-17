/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ingenieria
 */
public class Empleado extends Persona{
    
    private double sueldo;

    public Empleado(double sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado() {
    }
    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
