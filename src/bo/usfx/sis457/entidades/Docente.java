/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author Jhamil
 */
public class Docente extends Persona {
    protected String Titulo;
    protected int AnosDeExperiencia;
    protected String[] Asignaturas;

    public Docente(String Titulo, int AnosDeExperiencia, String carnetIdentidad, String nombre, Calendar fechaNacimiento, String[] Asignaturas) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Titulo = Titulo;
        this.AnosDeExperiencia = AnosDeExperiencia;
        this.Asignaturas = Asignaturas;
    }

    public Docente(String Titulo, int AnosDeExperiencia, String[] Asignaturas) {
        this.Titulo = Titulo;
        this.AnosDeExperiencia = AnosDeExperiencia;
        this.Asignaturas = Asignaturas;
    }

    public Docente(){
        
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAnosDeExperiencia() {
        return AnosDeExperiencia;
    }

    public void setAnosDeExperiencia(int AnosDeExperiencia) {
        this.AnosDeExperiencia = AnosDeExperiencia;
    }

    public String[] getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String Asignaturas) {
        
        this.Asignaturas = Asignaturas.split(",");
    }
    
    
    

    @Override
    public String toString() {
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Años de Experiencia=" +this.AnosDeExperiencia
                + ", Asignaturas=" + Arrays.toString(this.Asignaturas)
                + ", Titulo=" + Titulo + '}';
    }   
}
