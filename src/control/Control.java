/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

import java.util.*;
import modelo.*;
import vista.*;

/**
 *
 * @author Ingenieria
 */
public class Control {

    ArrayList<Persona> listaP = new ArrayList<>();
    ArrayList<Estudiante> listaE = new ArrayList<>();
    ArrayList<Egresado> listaEg = new ArrayList<>();
    ArrayList<Administrativo> listaAdmin = new ArrayList<>();
    ArrayList<Decano> listaDec = new ArrayList<>();
    ArrayList<Coordinador> listaCoor = new ArrayList<>();
    ArrayList<Docente> listaDoc = new ArrayList<>();

    Estudiante auxEs;
    Egresado auxEg;
    Administrativo auxAdmin;
    Decano auxDec;
    Coordinador auxCoor;
    Docente auxDoc;

    static Vista mos = new Vista();

    public static void main(String[] args) {
        int a = 0;
        Control ges = new Control();

        mos.logo();
        do {
            a = mos.menu();

            switch (a) {
                case 1:
                    ges.agregarEs();
                    break;  

                case 2:
                    ges.agregarEg();
                    break;

                case 3:
                    ges.agregarAdmin();
                    break;

                case 4:
                    ges.agregarDec();
                    break;

                case 5:
                    ges.agregarCoor();
                    break;

                case 6:
                    ges.agregarDoc();
                    break;
                default:
                    throw new AssertionError();
            }

        } while (a != 8);
    }

    public void agregarEs() {
        auxEs = new Estudiante();

        auxEs.setNombre(mos.agregarNombre());
        auxEs.setEdad(mos.agregarEd());
        auxEs.setCarrera(mos.agregarCarr());
        auxEs.setCodigo(mos.agregarCod());
        auxEs.setSemestre(mos.agregarSem());
        
        mos.agregado();

        listaE.add(auxEs);
    }

    public void agregarEg() {
        auxEg = new Egresado();

        auxEg.setNombre(mos.agregarNombre());
        auxEg.setEdad(mos.agregarEd());
        auxEg.setTitulo(mos.agregarTit());
        mos.agregado();

        listaEg.add(auxEg);
    }

    public void agregarAdmin() {
        auxAdmin = new Administrativo();

        auxAdmin.setNombre(mos.agregarNombre());
        auxAdmin.setEdad(mos.agregarEd());
        auxAdmin.setSueldo(mos.agregarSu());
        auxAdmin.setCargo(mos.agregarCarg());
        mos.agregado();

        listaAdmin.add(auxAdmin);
    }

    public void agregarDec() {
        auxDec = new Decano();

        auxDec.setNombre(mos.agregarNombre());
        auxDec.setEdad(mos.agregarEd());
        auxDec.setLabor(mos.agregarLab());
        auxDec.setFacultad(mos.agregarFac());
        auxDec.setSueldo(mos.agregarSu());
        mos.agregado();

        listaDec.add(auxDec);
    }

    public void agregarCoor() {
        auxCoor = new Coordinador();

        auxCoor.setNombre(mos.agregarNombre());
        auxCoor.setEdad(mos.agregarEd());
        auxCoor.setLabor(mos.agregarLab());
        auxCoor.setSueldo(mos.agregarSu());
        auxCoor.setTipo(mos.agregarTip());
        mos.agregado();

        listaCoor.add(auxCoor);

    }

    public void agregarDoc() {
        auxDoc = new Docente();
        
        auxDoc.setNombre(mos.agregarNombre());
        auxDoc.setEdad(mos.agregarEd());
        auxDoc.setLabor(mos.agregarLab());
        auxDoc.setSueldo(mos.agregarSu());
        auxDoc.setMateria(mos.agregarMat());
        mos.agregado();
        
        listaDoc.add(auxDoc);
    }
}
