package modelo.dominio;

import javax.swing.*;
import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private int edad;

    //creación de constructores

    public Alumno(String nombre, String apellido, String fechaDeNacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad = edad;
    }


    //creación setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
