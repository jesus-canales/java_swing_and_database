package com.entrecodigosycafe.professorapp.service;

import com.entrecodigosycafe.professorapp.model.ProfessorDAO;
import com.entrecodigosycafe.professorapp.model.ProfessorEntity;

public class ProfessorService {

    private final ProfessorDAO professorDAO = new ProfessorDAO();

    public void saveProfessor (String name, String lastName, String birthDate, String placeOfOrigin, String gender, String technologies, String modality) {
        ProfessorEntity professor = new ProfessorEntity (name, lastName, birthDate, placeOfOrigin, gender, technologies, modality);
        professorDAO.addProfessor(professor);
    }
}
