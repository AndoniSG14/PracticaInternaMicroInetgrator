package com.example.practica.controller;

import com.example.practica.service.annioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/annio")
public class annoController {

    private final annioService servicioOutput;

    public annoController(annioService servicioInput) {
        servicioOutput = servicioInput;
    }

    @GetMapping("/{annio}")
    public String getAnnio(@PathVariable int annio) {
        return servicioOutput.tipoAnnio(annio);
    }
}

