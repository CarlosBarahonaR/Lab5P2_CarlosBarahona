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
public class CEO {
    private Usuario usuario;
    private String nombre;
    private String apellido;
    private String titulacionPregado;
    private int ID;
    private int añosExp;
    private int edad;

    public CEO(Usuario usuario, String nombre, String apellido, String titulacionPregado, int ID, int añosExp, int edad) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulacionPregado = titulacionPregado;
        this.ID = ID;
        this.añosExp = añosExp;
        this.edad = edad;
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

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CEO{" + "usuario=" + usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", titulacionPregado=" + titulacionPregado + ", ID=" + ID + ", a\u00f1osExp=" + añosExp + ", edad=" + edad + '}';
    }
    
    
    
}
