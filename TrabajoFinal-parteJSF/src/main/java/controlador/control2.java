
package controlador;

import beans.Chofer;
import dao.Negocio;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class control2 {
    private String nombre;
    private List<Chofer> lischo;
    
    @PostConstruct
    public void init(){
        lischo = new ArrayList();
        lischo = new Negocio().lisChofer();
    }
    
    public void filtrar(){
        lischo = new Negocio().filtraChoferes(nombre);
    }
    
    public control2() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Chofer> getLischo() {
        return lischo;
    }

    public void setLischo(List<Chofer> lischo) {
        this.lischo = lischo;
    }
    
    
    
}
