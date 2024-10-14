package com.utp.DesarrolloWeb_15.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="chofer2")

public class Chofer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    String IDCOD;
    String CHONOM;
    String CHOFIN;
    String CHOCAT;
    double CHOSBA;

    public String getIDCOD() {
        return IDCOD;
    }

    public void setIDCOD(String IDCOD) {
        this.IDCOD = IDCOD;
    }

    public String getCHONOM() {
        return CHONOM;
    }

    public void setCHONOM(String CHONOM) {
        this.CHONOM = CHONOM;
    }

    public String getCHOFIN() {
        return CHOFIN;
    }

    public void setCHOFIN(String CHOFIN) {
        this.CHOFIN = CHOFIN;
    }

    public String getCHOCAT() {
        return CHOCAT;
    }

    public void setCHOCAT(String CHOCAT) {
        this.CHOCAT = CHOCAT;
    }

    public double getCHOSBA() {
        return CHOSBA;
    }

    public void setCHOSBA(double CHOSBA) {
        this.CHOSBA = CHOSBA;
    }

}