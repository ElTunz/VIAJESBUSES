package beans;

import java.io.Serializable;

public class Ruta implements Serializable{
    private String rutacod;
    private String rutanom;
    private double pagochofer;

    public Ruta() {
    }

    public Ruta(String rutacod, String rutanom, double pagochofer) {
        this.rutacod = rutacod;
        this.rutanom = rutanom;
        this.pagochofer = pagochofer;
    }

    
    public String getRutacod() {
        return rutacod;
    }

    public void setRutacod(String rutacod) {
        this.rutacod = rutacod;
    }

    public String getRutanom() {
        return rutanom;
    }

    public void setRutanom(String rutanom) {
        this.rutanom = rutanom;
    }

    public double getPagochofer() {
        return pagochofer;
    }

    public void setPagochofer(double pagochofer) {
        this.pagochofer = pagochofer;
    }
    
}