/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ingenieria
 */
public class Decano extends Academico {

    private String facultad;

    public Decano(String facultad, String labor, double sueldo, String nombre, int edad) {
        super(labor, sueldo, nombre, edad);
        this.facultad = facultad;
    }

    public Decano() {
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

}
