
package controlador;

import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import beans.*;
import dao.Negocio;
import javax.annotation.PostConstruct;

@ManagedBean
@ViewScoped
public class control1 implements Serializable {
    private List<SelectItem> lisrut;
    private List<Viaje> lisvia;
    List<Comprobante> lispas;
    private Ruta rut;
    String numvia;

    
    @PostConstruct
    public void init(){
        lisrut = new ArrayList();
        rut = new Ruta();
        for(Ruta x : new Negocio().lisRutas()){
            SelectItem item = new SelectItem(x.getRutacod(), x.getRutanom());
            lisrut.add(item);
        }
    }
    
    public void conViajes() {
        lisvia = new Negocio().lisRutasViajes(rut.getRutacod());
    }
    
    public void conPasajeros(Viaje v) {
        lispas = new ArrayList<>();
        lispas = new Negocio().pasajeros(v.getViajeNro());
        numvia = v.getViajeNro();
    }

    
    public control1() {
    }

    public List<Comprobante> getLispas() {
        return lispas;
    }

    public void setLispas(List<Comprobante> lispas) {
        this.lispas = lispas;
    }

    public String getNumvia() {
        return numvia;
    }

    public void setNumvia(String numvia) {
        this.numvia = numvia;
    }
    
    
    
    public List<SelectItem> getLisrut() {
        return lisrut;
    }

    public void setLisrut(List<SelectItem> lisrut) {
        this.lisrut = lisrut;
    }

    public List<Viaje> getLisvia() {
        return lisvia;
    }

    public void setLisvia(List<Viaje> lisvia) {
        this.lisvia = lisvia;
    }

    public Ruta getRut() {
        return rut;
    }

    public void setRut(Ruta rut) {
        this.rut = rut;
    }
    
    
}
