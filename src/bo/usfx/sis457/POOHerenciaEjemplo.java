/*
 * Archivo que contiene la Clase Principal del Programa
 * - En este ejemplo se muestra el principio de Herencia
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Jhamil
 */
public class POOHerenciaEjemplo {
    public static ArrayList<Persona> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] s={"sis457","sis103"};
        
        personas = new ArrayList<>();
        personas.add(new Alumno("35-1", 1, new String[]{"sis100,sis900"}));
        personas.add(new Docente("Licenciado en Informática",1, "222222", "Juan Perez", new GregorianCalendar(1980, 11,01),s ) );
        personas.add(new DocenteContrato("contarto N:1","Licenciado en Informática" , 0, new String[]{"fis100,mat43,mat70"}));
        personas.add(new Alumno("35-2", 1, new String[]{"fis100,mat43"}));
        personas.add(new Alumno("35-3", 1, new String[]{"sis457,gen106"}));
        personas.add(new DocenteTitular("sis100", "Ingeniero en Sistemas", 10, new String[]{"sis100,gen106"} ));
        personas.add(new Alumno("35-4", 1, new String[]{"sis100"}));
        
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Programa: Universidad                            |");
        System.out.println("| - Ejemplo de Herencia                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Personas                           |");
        System.out.println("| 2) Gestión de Docentes                           |");
        System.out.println("| 3) Gestión de Alumnos                            |");
        System.out.println("| 4) Gestión de Administrativos                    |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPersonas();
                break;
            case "2":
                menuDocentes();
                break;
            case "3":
                menuAlumnos();
                break;
            case "4":
                menuAdministrativos();
            default:
                System.out.println("Salió del Programa");
        }        
    }
    
    public static void menuPersonas() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Personas                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Personas                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPersonas();
                volverMenu();
                menuPersonas();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuDocentes() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes                               |");
        System.out.println("| 2) Añadir Docentes                               |");
        System.out.println("| 3) Modificar Docentes                            |");
        System.out.println("| 4) Borrar Docentes                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentes();
                volverMenu();
                menuDocentes();
                break;
            case "2":
                anadirDocente();
                volverMenu();
                menuDocentes();
                break;
            case "3":
                modificarDocente();
                volverMenu();
                menuDocentes();
                break;
            case "4":
                borrarDocente();
                volverMenu();
                menuDocentes();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuAlumnos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Alumnos                                |");
        System.out.println("| 2) Añadir Alumno                                 |");
        System.out.println("| 3) Modificar Alumno                              |");
        System.out.println("| 4) Borrar Alumno                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAlumnos();
                volverMenu();
                menuAlumnos();
                break;
            case "2":
                anadirAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "3":
                modificarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuAdministrativos(){
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Administrativos                       |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Administrativos                        |");
        System.out.println("| 2) Añadir Administrativos                        |");
        System.out.println("| 3) Modificar Administrativo                      |");
        System.out.println("| 4) Borrar Administrativo                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAdministrativos();
                volverMenu();
                menuAdministrativos();
                break;
            case "2":
                anadirAdministrativo();
                volverMenu();
                menuAdministrativos();
                break;
            case "3":
                modificarAdministrativo();
                volverMenu();
                menuAdministrativos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAdministrativos();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }
    
    public static void listarPersonas() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Personas                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarPersona(int id) {
        boolean existe = false;
        int i = 0;
        for (Persona persona: personas) {
            if (persona.getId() == id) {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
    public static void listarDocentes() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1: Docentes  Titulares                           |");
        System.out.println("| 2: Docentes  A Contrato                          |");
        System.out.println("| 3: Todos                                         |");
        System.out.println("+==================================================+");
        Scanner entradaTeclado = new Scanner(System.in);
        int opcion = entradaTeclado.nextInt();
        int i = 0;
        for (Persona tipo: personas) {
            if ((opcion==1 ||opcion==3) && tipo instanceof DocenteTitular ) {
                i++;
                System.out.println(i + ": " + tipo);
            }
            if ((opcion==2 || opcion==3) && tipo instanceof DocenteContrato ) {
                i++;
                System.out.println(i + ": " + tipo);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirDocente() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String aux;
        int anosExperiencia,op;
        String titulo;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        Scanner reader= new Scanner(System.in);  
        limpiarConsola();
        try {
            //Docente();
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente                                   |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca Años de experiencia: ");
            anosExperiencia = reader.nextInt();
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca el Materias (ejemplo: mat1,mat2): ");
            aux = entradaTeclado.readLine();
            String[] materias=aux.split(",");
            System.out.print("1:Docente Titular o 2:Docente Contratado?");
            op=reader.nextInt();
            if(op==1){
                System.out.print("Introduzca Examen de Competencia:");
                String Examen=entradaTeclado.readLine();
                personas.add(new DocenteTitular(Examen, titulo, anosExperiencia, carnetIdentidad, nombre, fechaNacimientoCalendario, materias));
            }
            else{
                System.out.print("Introduzca Numero de Contrato:");
                String contrato=entradaTeclado.readLine();
                personas.add(new DocenteContrato(contrato, titulo, anosExperiencia, carnetIdentidad, nombre, fechaNacimientoCalendario, materias));
            }
            System.out.println("Registro de Docente completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocente() {
        int id;
        Docente docente;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        Scanner reader=new Scanner(System.in);
        limpiarConsola();
        
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente                                |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docente = (Docente)personas.get(id);
                System.out.print("Modificar el Titulo '" + docente.getTitulo()+ "': ");
                docente.setTitulo(entradaTeclado.readLine());
                System.out.print("Modificar el Años de Experiencia '" + docente.getAnosDeExperiencia()+ "': ");
                docente.setAnosDeExperiencia(reader.nextInt());
                System.out.print("Modificar el Carnet de Identidad '" + docente.getCarnetIdentidad()+ "': ");
                docente.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docente.getNombre() + "': ");
                docente.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docente.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docente.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar las Materias '"+Arrays.toString(docente.getAsignaturas()  )+"': ");
                docente.setAsignaturas(entradaTeclado.readLine());
                if(personas.get(id) instanceof DocenteTitular ){
                    DocenteTitular docenteTitular=(DocenteTitular)docente;
                    System.out.println("Modificar Examen De Competencia '"+docenteTitular.getExamenDeCompetencia()+"': ");
                    docenteTitular.setExamenDeCompetencia(entradaTeclado.readLine());
                    personas.set(id, docenteTitular);
                }
                else{
                    DocenteContrato docenteContrato=(DocenteContrato)docente;
                    System.out.println("Modificar Numero de Contrato '"+docenteContrato.getNumeroDeContrato()+"': ");
                    docenteContrato.setNumeroDeContrato(entradaTeclado.readLine());
                    personas.set(id, docenteContrato);
                }
                
                System.out.println("Registro de Docente modificado!");
                
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocente() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente borrado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String carnetUniversitario;
        int semestre;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca el Materias (ejemplo: mat1,mat2): ");
            String aux = entradaTeclado.readLine();
            String[] materias=aux.split(",");
            personas.add(new Alumno(carnetUniversitario, semestre, materias, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Alumno completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAlumno() {
        int id;
        Alumno alumno;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Alumno                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                alumno = (Alumno)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + alumno.getCarnetIdentidad()+ "': ");
                alumno.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + alumno.getNombre() + "': ");
                alumno.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(alumno.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el CU '" + alumno.getCarnetUniversitario() + "': ");
                alumno.setCarnetUniversitario(entradaTeclado.readLine());
                System.out.print("Introduzca el Semestre: ");
                alumno.setSemestre(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar las Materias '"+Arrays.toString(alumno.getAsignaturas()  )+"': ");
                alumno.setAsignaturas(entradaTeclado.readLine());
                personas.set(id, alumno);
                
                System.out.println("Registro de Alumno modificado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAlumno() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Alumno                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Alumno borrado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void listarAdministrativos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Administrativos                       |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona administrativo: personas) {
            if (administrativo instanceof Administrativo) {
                i++;
                System.out.println(i + ": " + administrativo);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAdministrativo() {
        String cargo;
        String lugarTrabajo;
        String fechaIngreso;
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Administrativo                            |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Cargo: ");
            cargo = entradaTeclado.readLine();
            System.out.print("Introduzca el Lugar de Trabajo: ");
            lugarTrabajo = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Ingreso (ejemplo: 1980-01-01): ");
            fechaIngreso = entradaTeclado.readLine();
            
            Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaIngreso);
            Calendar fechaIngresoCalendario = Calendar.getInstance();
            fechaIngresoCalendario.setTime(fechaIngresoDate);
            
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            
            personas.add(new Administrativo(cargo, lugarTrabajo, fechaIngresoCalendario, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Administrativo completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAdministrativo() {
        int id;
        Administrativo administrativo;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Administrativo                         |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrativo a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                administrativo = (Administrativo)personas.get(id);
                System.out.print("Modificar el Cargo '" + administrativo.getCargo()+ "': ");
                administrativo.setCargo(entradaTeclado.readLine());
                System.out.print("Modificar el Lugar de Trabajo '" + administrativo.getLugarTrabajo()+ "': ");
                administrativo.setLugarTrabajo(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Ingreso '" + Utilitarios.getFechaCalendario(administrativo.getFechaIngreso()) + "': ");
                Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaIngresoCalendario = Calendar.getInstance();
                fechaIngresoCalendario.setTime(fechaIngresoDate);
                administrativo.setFechaIngreso(fechaIngresoCalendario);
                System.out.print("Modificar el Carnet de Identidad '" + administrativo.getCarnetIdentidad()+ "': ");
                administrativo.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + administrativo.getNombre() + "': ");
                administrativo.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(administrativo.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                administrativo.setFechaNacimiento(fechaNacimientoCalendario);
                personas.set(id, administrativo);
                System.out.println("Registro de Administrativo modificado!");
            } else {
                System.out.println("El Registro de Administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAdministrativo() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Administrativo                            |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Administrativo borrado!");
            } else {
                System.out.println("El Registro de Administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
