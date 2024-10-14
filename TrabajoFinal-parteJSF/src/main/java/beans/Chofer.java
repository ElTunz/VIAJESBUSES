package beans;

import java.io.Serializable;

public class Chofer implements Serializable{
    private String codigo;
    private String nombre;
    private String fechaingreso;
    private String categoria;
    private double sueldo;

    public Chofer() {
    }

    public Chofer(String codigo, String nombre, String fechaingreso, String categoria, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaingreso = fechaingreso;
        this.categoria = categoria;
        this.sueldo = sueldo;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}