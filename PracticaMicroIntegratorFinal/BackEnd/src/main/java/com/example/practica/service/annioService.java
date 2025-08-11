package com.example.practica.service;

import com.example.practica.model.inputAnnio;
import org.springframework.stereotype.Service;

import java.time.Year;

@Service
public class annioService {

    public String tipoAnnio(inputAnnio annio) {
       if (Year.isLeap(Integer.parseInt(annio.getAnioNacimiento())))return "BISIESTO";
        return "NO BISIESTO";
    }
}
