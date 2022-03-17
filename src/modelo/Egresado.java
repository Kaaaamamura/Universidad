/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ingenieria
 */
public class Egresado extends Persona{
    private String titulo;

    public Egresado(String titulo, String nombre, int edad) {
        super(nombre, edad);
        this.titulo = titulo;
    }

    public Egresado() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
}
