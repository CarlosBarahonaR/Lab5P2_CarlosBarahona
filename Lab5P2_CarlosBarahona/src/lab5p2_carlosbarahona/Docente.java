/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_carlosbarahona;

/**
 *
 * @author Admin
 */
public class Docente {
    private Usuario usuario;
    private String nombre;
    private String apellido;
    private String titulacionPregrado;
    private String titulacionMaestria;
    private int maxAlumnos;
    private String nombreClase;
    private String descripcionClase;

    public Docente(Usuario usuario, String nombre, String apellido, String titulacionPregrado, String titulacionMaestria, int maxAlumnos, String nombreClase, String descripcionClase) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulacionPregrado = titulacionPregrado;
        this.titulacionMaestria = titulacionMaestria;
        this.maxAlumnos = maxAlumnos;
        this.nombreClase = nombreClase;
        this.descripcionClase = descripcionClase;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

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

    public String getTitulacionPregrado() {
        return titulacionPregrado;
    }

    public void setTitulacionPregrado(String titulacionPregrado) {
        this.titulacionPregrado = titulacionPregrado;
    }

    public String getTitulacionMaestria() {
        return titulacionMaestria;
    }

    public void setTitulacionMaestria(String titulacionMaestria) {
        this.titulacionMaestria = titulacionMaestria;
    }

    public int getMaxAlumnos() {
        return maxAlumnos;
    }

    public void setMaxAlumnos(int maxAlumnos) {
        this.maxAlumnos = maxAlumnos;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getDescripcionClase() {
        return descripcionClase;
    }

    public void setDescripcionClase(String descripcionClase) {
        this.descripcionClase = descripcionClase;
    }

    @Override
    public String toString() {
        return "Docente{" + "usuario=" + usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", titulacionPregrado=" + titulacionPregrado + ", titulacionMaestria=" + titulacionMaestria + ", maxAlumnos=" + maxAlumnos + ", nombreClase=" + nombreClase + ", descripcionClase=" + descripcionClase + '}';
    }
    
    
}
