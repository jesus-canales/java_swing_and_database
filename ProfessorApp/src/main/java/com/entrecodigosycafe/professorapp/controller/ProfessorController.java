package com.entrecodigosycafe.professorapp.controller;

import com.entrecodigosycafe.professorapp.service.ProfessorService;

public class ProfessorController {

    private final ProfessorService professorService = new ProfessorService();

    public void guardarProfessor(String nombre, String apellido, String fechaNacimiento, String lugarProcedencia, String genero, String tecnologias, String modalidad) {
        professorService.saveProfessor(nombre, apellido, fechaNacimiento, lugarProcedencia, genero, tecnologias, modalidad);
    }
}
