/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_carlosbarahona;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Alumno {
    private Usuario usuario;
    private String nombre; 
    private String apellido;
    private int noCuenta;
    private String Carrera;
    private int añoCarrera;
    private int cantidadClasesFaltantes;
    private ArrayList pruebas;

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

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getAñoCarrera() {
        return añoCarrera;
    }

    public void setAñoCarrera(int añoCarrera) {
        this.añoCarrera = añoCarrera;
    }

    public int getCantidadClasesFaltantes() {
        return cantidadClasesFaltantes;
    }

    public void setCantidadClasesFaltantes(int cantidadClasesFaltantes) {
        this.cantidadClasesFaltantes = cantidadClasesFaltantes;
    }

    public ArrayList getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList pruebas) {
        this.pruebas = pruebas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "usuario=" + usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", noCuenta=" + noCuenta + ", Carrera=" + Carrera + ", a\u00f1oCarrera=" + añoCarrera + ", cantidadClasesFaltantes=" + cantidadClasesFaltantes + ", pruebas=" + pruebas + '}';
    }
    
    
}
