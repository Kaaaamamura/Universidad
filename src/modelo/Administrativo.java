/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ingenieria
 */
public class Administrativo extends Empleado{
    
    private String cargo;

    public Administrativo(String cargo, double sueldo, String nombre, int edad) {
        super(sueldo, nombre, edad);
        this.cargo = cargo;
    }

    public Administrativo() {
    }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
