package modelo.dominio;

public class Curso {
    private String nombre;
    private Boolean estaHabilitada;
    private String descripcion;
    private String alumnos;


    //creacion de constructores

    public Curso(String nombre, Boolean estaHabilitada, String descripcion, Alumno alumnos) {
        this.nombre = nombre;
        this.estaHabilitada = estaHabilitada;
        this.descripcion = descripcion;
        this.alumnos = getAlumnos();
    }

    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstaHabilitada() {
        return estaHabilitada;
    }

    public void setEstaHabilitada(Boolean estaHabilitada) {
        this.estaHabilitada = estaHabilitada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos() {
        this.alumnos = alumnos;
    }
}