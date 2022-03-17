/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.*;

public class Vista {

    public void logo() {
        JOptionPane.showMessageDialog(null, """
                                            ******************************
                                            *       Universidad          *
                                            * Kevin Felipe Vargas Farf\u00e1n *
                                            ******************************""");
    }

    public int menu() {
        int a = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las siguientes opciones:"
                + "1. ingresar estudiante"
                + "2. ingresar egresado"
                + "3. ingresar Administrativo"
                + "4. ingresar decano"
                + "5. ingresar coordinador"
                + "6. ingresar docente"
                + "7. contar personas"
                + "8. salir"));
        return a;
    }

    public String agregarNombre() {
        return JOptionPane.showInputDialog("ingrese el nombre");
    }
    public int agregarEd(){
        return Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
    }
    public String agregarCarr(){
        return JOptionPane.showInputDialog("ingrese la carrera");
    }
    public String agregarCod(){
        return JOptionPane.showInputDialog("ingrese el codigo");
    }

    public int agregarSem() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre"));
    }
    
    public String agregarTit(){
        return JOptionPane.showInputDialog("Ingrese el titulo");
    }
    
    public double agregarSu(){
        return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo"));
    }
    
    public String agregarCarg(){
        return JOptionPane.showInputDialog("Ingrese el cargo");
    }
    public String agregarLab(){
        return JOptionPane.showInputDialog("Ingrese la labor");
    }
    public String agregarFac(){
        return JOptionPane.showInputDialog("Ingrese la facultad");
    }
    
    public String agregarTip(){
        return JOptionPane.showInputDialog("Ingrese el tipo");
    }
    
    public String agregarMat(){
        return JOptionPane.showInputDialog("Ingrese la materia");
    }
    
    public void agregado(){
        JOptionPane.showMessageDialog(null, "Personal agregado con exito");
    }

}
