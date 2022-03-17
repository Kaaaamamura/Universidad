/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ingenieria
 */
public class Coordinador extends Academico {

    private String tipo;

    public Coordinador(String tipo, String labor, double sueldo, String nombre, int edad) {
        super(labor, sueldo, nombre, edad);
        this.tipo = tipo;
    }

    public Coordinador() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
