package com.entrecodigosycafe.professorapp.controller;

import com.entrecodigosycafe.professorapp.model.ProfessorEntity;
import com.entrecodigosycafe.professorapp.service.ProfessorService;

public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    public boolean saveProfessor (String nombre, String apellido, String fechaNacimiento, String lugarProcedencia,
                                     String genero, String tecnologias, String modalidad) {
        try{
            professorService.saveProfessor(nombre, apellido, fechaNacimiento, lugarProcedencia, genero, tecnologias, modalidad);
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar el professor");
            return false;
        }
    }
}
