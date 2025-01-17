package beans;

import java.io.Serializable;

public class Viaje implements Serializable{
    private String viajeNro;
    private int busNro;
    private String rutaCodigo;
    private String idCodChofer;
    private String viajeHoras;
    private String viajeFechas;
    private double costoViaje;

    public Viaje() {
    }

    public Viaje(String viajeNro, int busNro, String rutaCodigo, String idCodChofer, String viajeHoras, String viajeFechas, double costoViaje) {
        this.viajeNro = viajeNro;
        this.busNro = busNro;
        this.rutaCodigo = rutaCodigo;
        this.idCodChofer = idCodChofer;
        this.viajeHoras = viajeHoras;
        this.viajeFechas = viajeFechas;
        this.costoViaje = costoViaje;
    }

    
    
    public String getViajeNro() {
        return viajeNro;
    }

    public void setViajeNro(String viajeNro) {
        this.viajeNro = viajeNro;
    }

    public int getBusNro() {
        return busNro;
    }

    public void setBusNro(int busNro) {
        this.busNro = busNro;
    }

    public String getRutaCodigo() {
        return rutaCodigo;
    }

    public void setRutaCodigo(String rutaCodigo) {
        this.rutaCodigo = rutaCodigo;
    }

    public String getIdCodChofer() {
        return idCodChofer;
    }

    public void setIdCodChofer(String idCodChofer) {
        this.idCodChofer = idCodChofer;
    }

    public String getViajeHoras() {
        return viajeHoras;
    }

    public void setViajeHoras(String viajeHoras) {
        this.viajeHoras = viajeHoras;
    }

    public String getViajeFechas() {
        return viajeFechas;
    }

    public void setViajeFechas(String viajeFechas) {
        this.viajeFechas = viajeFechas;
    }

    public double getCostoViaje() {
        return costoViaje;
    }

    public void setCostoViaje(double costoViaje) {
        this.costoViaje = costoViaje;
    }
    
}