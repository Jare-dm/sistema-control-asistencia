package model;

public class Curso {

    private String id;
    private String nombre;
    private int creditos;

    public Curso(String id, String nombre, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }
}