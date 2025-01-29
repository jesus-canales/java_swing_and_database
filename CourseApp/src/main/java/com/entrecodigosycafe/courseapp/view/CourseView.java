package com.entrecodigosycafe.courseapp.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CourseView extends JFrame {

    private JLabel lblCourse;
    private JTextField txtCourse;
    private JLabel lblPrice;
    private JTextField txtPrice;
    private JButton btnSave;

    public CourseView() {
        setTitle("Registrar curso");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocationRelativeTo(null);
        setResizable(false);

        lblCourse = new JLabel("Nombre de curso");
        txtCourse = new JTextField(20);
        lblPrice = new JLabel("Precio");
        txtPrice = new JTextField(20);
        btnSave = new JButton("Guardar");

        JPanel pnlRegister = new JPanel();
        pnlRegister.setBackground(new Color(255, 230, 201));
        pnlRegister.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        pnlRegister.add(lblCourse, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        pnlRegister.add(txtCourse, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        pnlRegister.add(lblPrice, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        pnlRegister.add(txtPrice, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        pnlRegister.add(btnSave, gbc);

        add(pnlRegister, BorderLayout.CENTER);
    }

    public String getCourse() {
        return txtCourse.getText();
    }

    public String getPrice() {
        return txtPrice.getText();
    }

    public void addListenerSave (ActionListener actionListener) {
        btnSave.addActionListener(actionListener);
    }

}
