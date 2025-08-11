package com.example.practica.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Service
public class annioService {
    public String tipoAnnio(int annio) {
        if (Year.isLeap(annio))return "BISIESTO";
        return "NO BISIESTO";
    }
}
