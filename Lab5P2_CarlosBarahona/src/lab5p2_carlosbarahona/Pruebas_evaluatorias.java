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
public class Pruebas_evaluatorias {
    private String trabajoEquipo;
    private String cooperacion;
    private String participacion;
    private String evaluacionNota;
    private int evaluacionGeneral;

    public Pruebas_evaluatorias(String trabajoEquipo, String cooperacion, String participacion, String evaluacionNota, int evaluacionGeneral) {
        this.trabajoEquipo = trabajoEquipo;
        this.cooperacion = cooperacion;
        this.participacion = participacion;
        this.evaluacionNota = evaluacionNota;
        this.evaluacionGeneral = evaluacionGeneral;
    }

    public String getTrabajoEquipo() {
        return trabajoEquipo;
    }

    public void setTrabajoEquipo(String trabajoEquipo) {
        this.trabajoEquipo = trabajoEquipo;
    }

    public String getCooperacion() {
        return cooperacion;
    }

    public void setCooperacion(String cooperacion) {
        this.cooperacion = cooperacion;
    }

    public String getParticipacion() {
        return participacion;
    }

    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }

    public String getEvaluacionNota() {
        return evaluacionNota;
    }

    public void setEvaluacionNota(String evaluacionNota) {
        this.evaluacionNota = evaluacionNota;
    }

    public int getEvaluacionGeneral() {
        return evaluacionGeneral;
    }

    public void setEvaluacionGeneral(int evaluacionGeneral) {
        this.evaluacionGeneral = evaluacionGeneral;
    }

    @Override
    public String toString() {
        return "Pruebas_evaluatorias{" + "trabajoEquipo=" + trabajoEquipo + ", cooperacion=" + cooperacion + ", participacion=" + participacion + ", evaluacionNota=" + evaluacionNota + ", evaluacionGeneral=" + evaluacionGeneral + '}';
    }
    
    
    
}
