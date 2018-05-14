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
public class DocenteContrato extends Docente{
    protected String NumeroDeContrato;

    public DocenteContrato(String NumeroDeContrato, String Titulo, int AnosDeExperiencia, String carnetIdentidad, String nombre, Calendar fechaNacimiento, String[] Asignaturas) {
        super(Titulo, AnosDeExperiencia, carnetIdentidad, nombre, fechaNacimiento, Asignaturas);
        this.NumeroDeContrato = NumeroDeContrato;
    }

    public DocenteContrato(String NumeroDeContrato, String Titulo, int AnosDeExperiencia, String[] Asignaturas) {
        super(Titulo, AnosDeExperiencia, Asignaturas);
        this.NumeroDeContrato = NumeroDeContrato;
    }

    public DocenteContrato(String NumeroDeContrato) {
        this.NumeroDeContrato = NumeroDeContrato;
    }

    public DocenteContrato() {
    }

    public String getNumeroDeContrato() {
        return NumeroDeContrato;
    }

    public void setNumeroDeContrato(String NumeroDeContrato) {
        this.NumeroDeContrato = NumeroDeContrato;
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
                + ", Titulo=" + Titulo 
                + ", Numero de Contrato=" + this.NumeroDeContrato  + '}';
    }   
    
    
}
