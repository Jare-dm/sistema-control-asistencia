package model;

public class Asistencia {

    private String alumno;
    private String fecha;
    private String estado;

    public Asistencia(String alumno, String fecha, String estado) {
        this.alumno = alumno;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getAlumno() {
        return alumno;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}