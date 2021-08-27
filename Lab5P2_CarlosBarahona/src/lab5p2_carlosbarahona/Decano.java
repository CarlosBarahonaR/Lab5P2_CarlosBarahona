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
public class Decano {
    private Usuario usuario;
    private String nombre;
    private String apellido;
    private String titulacionPregado;
    private int ID;
    private int edad;
    private String tituloUniversitario;
    private String tituloMaestria;

    public Decano(Usuario usuario, String nombre, String apellido, String titulacionPregado, int ID, int edad, String tituloUniversitario, String tituloMaestria) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulacionPregado = titulacionPregado;
        this.ID = ID;
        this.edad = edad;
        this.tituloUniversitario = tituloUniversitario;
        this.tituloMaestria = tituloMaestria;
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

    public String getTitulacionPregado() {
        return titulacionPregado;
    }

    public void setTitulacionPregado(String titulacionPregado) {
        this.titulacionPregado = titulacionPregado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public String getTituloMaestria() {
        return tituloMaestria;
    }

    public void setTituloMaestria(String tituloMaestria) {
        this.tituloMaestria = tituloMaestria;
    }

    @Override
    public String toString() {
        return "Decano{" + "usuario=" + usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", titulacionPregado=" + titulacionPregado + ", ID=" + ID + ", edad=" + edad + ", tituloUniversitario=" + tituloUniversitario + ", tituloMaestria=" + tituloMaestria + '}';
    }

   
    
    
    
}
