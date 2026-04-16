package com.techShop.tienda.controller;

import com.techShop.tienda.service.RutaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ruta")
public class RutaController {

    private final RutaService rutaService;

    public RutaController(RutaService rutaService) {
        this.rutaService = rutaService;
    }

    @GetMapping("/listado")
    public String listado(Model model) {
        var rutas = rutaService.getRutas();
        model.addAttribute("rutas", rutas);
        model.addAttribute("totalRutas", rutas.size());
        return "/ruta/listado";
    }
}
