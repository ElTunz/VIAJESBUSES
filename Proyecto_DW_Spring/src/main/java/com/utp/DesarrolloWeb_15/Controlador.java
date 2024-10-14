package com.utp.DesarrolloWeb_15;

import com.utp.DesarrolloWeb_15.modelo.Chofer;
import com.utp.DesarrolloWeb_15.modelo.Servicio;
import jakarta.validation.Valid;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Controlador {

    @Autowired
    private Servicio servi;

    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/listar")
    public String listar(Model modelo) {
        modelo.addAttribute("listado", servi.findAll());
        double sm = 0;
        for (Chofer x : servi.findAll()) {
            sm = sm + x.getCHOSBA();
        }
        modelo.addAttribute("total", sm);
        return "index";
    }

    @GetMapping("/new")
    public String nuevo(Model modelo) {
        modelo.addAttribute("titulo", "Formulario Adicion");
        modelo.addAttribute("persona", new Chofer());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid Chofer p, Model modelo) {
        servi.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable String id, Model modelo) {
        Optional<Chofer> persona = servi.findById(id);
        modelo.addAttribute("titulo", "Formulario Editar");
        modelo.addAttribute("persona", persona);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id, Model modelo) {
        servi.deleteById(id);
        return "redirect:/listar";
    }

}