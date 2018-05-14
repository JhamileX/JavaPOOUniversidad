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
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DocenteTitular extends Docente{
    protected String ExamenDeCompetencia;

    public DocenteTitular(String ExamenDeCompetencia, String Titulo, int AnosDeExperiencia, String carnetIdentidad, String nombre, Calendar fechaNacimiento, String[] Asignaturas) {
        super(Titulo, AnosDeExperiencia, carnetIdentidad, nombre, fechaNacimiento, Asignaturas);
        this.ExamenDeCompetencia = ExamenDeCompetencia;
    }

    public DocenteTitular(String ExamenDeCompetencia, String Titulo, int AnosDeExperiencia, String[] Asignaturas) {
        super(Titulo, AnosDeExperiencia, Asignaturas);
        this.ExamenDeCompetencia = ExamenDeCompetencia;
    }

    public DocenteTitular(String ExamenDeCompetencia) {
        this.ExamenDeCompetencia = ExamenDeCompetencia;
    }


    public DocenteTitular() {
    }

    public String getExamenDeCompetencia() {
        return ExamenDeCompetencia;
    }

    public void setExamenDeCompetencia(String ExamenDeCompetencia) {
        this.ExamenDeCompetencia = ExamenDeCompetencia;
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
                + ", Examen de Competencia=" + this.ExamenDeCompetencia  + '}';
    }  
    
}
