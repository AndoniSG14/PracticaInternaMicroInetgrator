package com.example.practica.controller;

import com.example.practica.model.inputAnnio;
import com.example.practica.service.annioService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/annio")
public class annoController {

    private final annioService servicioOutput;

    public annoController(annioService servicioInput) {
        servicioOutput = servicioInput;
    }

    @PostMapping("/tipo")
    public String getAnnio(@RequestBody inputAnnio body) {
        return servicioOutput.tipoAnnio(body);
    }
}

