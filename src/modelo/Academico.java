/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ingenieria
 */
public class Academico extends Empleado {

    private String labor;

    public Academico(String labor, double sueldo, String nombre, int edad) {
        super(sueldo, nombre, edad);
        this.labor = labor;
    }

    public Academico() {
    }
    

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

}
