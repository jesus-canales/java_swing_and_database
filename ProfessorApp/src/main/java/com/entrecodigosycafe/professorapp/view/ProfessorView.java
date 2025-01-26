package com.entrecodigosycafe.professorapp.view;

import javax.swing.*;
import java.awt.*;

public class ProfessorView extends JFrame {

    public ProfessorView() {
        this.setTitle("Registrar datos de Profesor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(700, 500);

        this.add(contentRegister());
        this.setVisible(true);
    }

    private JPanel contentRegister () {
        JPanel pnlRegister = new JPanel();
        pnlRegister.setBackground(new Color(179, 200, 207));
        pnlRegister.setLayout(new GridBagLayout());

        return pnlRegister;
    }
}
