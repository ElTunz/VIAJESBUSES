package com.utp.DesarrolloWeb_15.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="viaje2")

public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    int VIANRO;
    int BUSNRO;
    String RUTCOD;
    int IDCOD;
    String VIAHRS;
    String VIAFCH;
    double COSVIA;

    public int getVIANRO() {
        return VIANRO;
    }

    public void setVIANRO(int VIANRO) {
        this.VIANRO = VIANRO;
    }

    public int getBUSNRO() {
        return BUSNRO;
    }

    public void setBUSNRO(int BUSNRO) {
        this.BUSNRO = BUSNRO;
    }

    public String getRUTCOD() {
        return RUTCOD;
    }

    public void setRUTCOD(String RUTCOD) {
        this.RUTCOD = RUTCOD;
    }

    public int getIDCOD() {
        return IDCOD;
    }

    public void setIDCOD(int IDCOD) {
        this.IDCOD = IDCOD;
    }

    public String getVIAHRS() {
        return VIAHRS;
    }

    public void setVIAHRS(String VIAHRS) {
        this.VIAHRS = VIAHRS;
    }

    public String getVIAFCH() {
        return VIAFCH;
    }

    public void setVIAFCH(String VIAFCH) {
        this.VIAFCH = VIAFCH;
    }

    public double getCOSVIA() {
        return COSVIA;
    }

    public void setCOSVIA(double COSVIA) {
        this.COSVIA = COSVIA;
    }
    
}