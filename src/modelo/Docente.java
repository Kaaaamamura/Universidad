/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ingenieria
 */
public class Docente extends Academico {

    private String materia;

    public Docente(String materia, String labor, double sueldo, String nombre, int edad) {
        super(labor, sueldo, nombre, edad);
        this.materia = materia;
    }

    public Docente() {
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}
