package controlador;

import modelo.dominio.Alumno;
import modelo.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        /*Alumno primer_alumno = new Alumno("Nicolas", "Balbiani", "1992-08-06", 31);
        Alumno segundo_alumno = new Alumno("Juan", "Gomez", "1985-01-31", 38);
        Alumno tercer_alumno = new Alumno("Ricardo", "Tapia", "1966-12-01", 56);
        System.out.println("El nombre del alumno 1 es " + primer_alumno.getNombre() + ", su apellido es "+ primer_alumno.getApellido() + ", su fecha de nacimiento es " + primer_alumno.getFechaDeNacimiento() + " y su edad es "+ primer_alumno.getEdad());
        System.out.println("El nombre del alumno 2 es " + segundo_alumno.getNombre() + ", su apellido es "+ segundo_alumno.getApellido() + ", su fecha de nacimiento es " + segundo_alumno.getFechaDeNacimiento() + " y su edad es "+ segundo_alumno.getEdad());
        System.out.println("El nombre del alumno 3 es " + tercer_alumno.getNombre() + ", su apellido es "+ tercer_alumno.getApellido() + ", su fecha de nacimiento es " + tercer_alumno.getFechaDeNacimiento() + " y su edad es "+ tercer_alumno.getEdad());

        System.out.println("\n");
        Curso curso_java = new Curso("Java", Boolean.TRUE, "la introducción a Java", primer_alumno );
        System.out.println("El nombre del curso es " + curso_java.getNombre() + ", su habilitación es "+ curso_java.getEstaHabilitada() + ", el mismo trata sobre " + curso_java.getDescripcion() + ", y sus alumnos son " + primer_alumno.getNombre() +" "+ primer_alumno.getApellido() + ", "+ segundo_alumno.getNombre() + " " + segundo_alumno.getApellido() + " y " + tercer_alumno.getNombre() +" "+ tercer_alumno.getApellido());*/


        String[] nombres = { "Nicolás", "Juan", "Ricardo"};
        String[] apellidos = { "Balbi", "Gomez", "Tapia"};
        int[] edades = { 31, 38, 56};

        for (int i = 0; i < nombres.length; i++) {
                System.out.println(nombres[i]+", "+apellidos[i]+", " +edades[i]);
        }

        String[] cursos = { "JAVA", "PYTHON", "REACT"};
        Boolean[] habil = {Boolean.TRUE, Boolean.FALSE};
        String[] descripcion = {"la introducción a cada uno de ellos"};

        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Los cursos son " + cursos[i]+", "+cursos[i+1]+", "+cursos[i+2]+", su habilitación es "+ true +", el curso trata sobre " +descripcion[i]+", y los alumnos inscriptos son "+nombres[i]+", "+nombres[i+1]+" y "+nombres[i+2]);
        }

        }
    }