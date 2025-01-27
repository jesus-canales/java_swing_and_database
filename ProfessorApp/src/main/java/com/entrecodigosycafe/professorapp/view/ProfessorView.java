package com.entrecodigosycafe.professorapp.view;

import org.jdatepicker.JDatePanel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilCalendarModel;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;

public class ProfessorView extends JFrame {

    private JTextField txtNombre, txtApellido;
    private JDatePickerImpl datePicker;
    private JComboBox<String> cmbPlaceOfOrigin, cmbModality;
    private JRadioButton rdbtnMale, rdbtnFemale;
    private JCheckBox chbJava, chbPython, chbJavaScript, chbSQL;
    private JButton btnGuardar;

    public ProfessorView() {
        this.setTitle("Registrar datos de Profesor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
        this.setResizable(false);

        this.add(contentRegister());
        this.setVisible(true);
    }

    private JPanel contentRegister () {
        JPanel pnlRegister = new JPanel();
        pnlRegister.setBackground(new Color(179, 200, 207));
        pnlRegister.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;

        Color fondoColor = new Color(179, 200, 207);

        JLabel lblNombre = new JLabel("Nombres: ");
        txtNombre = new JTextField();

        JLabel lblApellido = new JLabel("Apellidos: ");
        txtApellido = new JTextField();

        JLabel lblDate = new JLabel("Fecha de nacimiento: ");
        datePicker = createDatePicker();

        JLabel lblPlaceOfOrigin = new JLabel("Lugar de procedencia: ");
        String[] places = {"Seleccione", "Lima", "Chiclayo", "Piura", "Arequipa"};
        cmbPlaceOfOrigin = new JComboBox<>(places);

        JLabel lblGender = new JLabel("Género: ");
        JPanel pnlGender = new JPanel();
        pnlGender.setBackground(fondoColor);
        rdbtnMale = new JRadioButton("Masculino");
        rdbtnMale.setBackground(fondoColor);
        rdbtnFemale = new JRadioButton("Femenino");
        rdbtnFemale.setBackground(fondoColor);
        ButtonGroup groupGender = new ButtonGroup();
        groupGender.add(rdbtnMale);
        groupGender.add(rdbtnFemale);
        pnlGender.add(rdbtnMale);
        pnlGender.add(rdbtnFemale);

        JLabel lblTechnologies = new JLabel("Tecnologías: ");
        JPanel pnlTechnologies = new JPanel();
        pnlTechnologies.setBackground(fondoColor);
        chbJava = new JCheckBox("Java");
        chbJava.setBackground(fondoColor);
        chbPython = new JCheckBox("Python");
        chbPython.setBackground(fondoColor);
        chbJavaScript = new JCheckBox("JavaScript");
        chbJavaScript.setBackground(fondoColor);
        chbSQL = new JCheckBox("SQL");
        chbSQL.setBackground(fondoColor);
        pnlTechnologies.add(chbJava);
        pnlTechnologies.add(chbPython);
        pnlTechnologies.add(chbJavaScript);
        pnlTechnologies.add(chbSQL);

        JLabel lblModalidad = new JLabel("Modalidad: ");
        String[] modalities = {"Seleccione", "Presencial", "Remoto", "Híbrido"};
        cmbModality = new JComboBox<>(modalities);

        btnGuardar = new JButton("Guardar");

        gbc.gridx = 0;
        gbc.gridy = 0;
        pnlRegister.add(lblNombre, gbc);

        gbc.gridx = 1;
        pnlRegister.add(txtNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        pnlRegister.add(lblApellido, gbc);

        gbc.gridx = 1;
        pnlRegister.add(txtApellido, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        pnlRegister.add(lblDate, gbc);

        gbc.gridx = 1;
        pnlRegister.add(datePicker, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        pnlRegister.add(lblPlaceOfOrigin, gbc);

        gbc.gridx = 1;
        pnlRegister.add(cmbPlaceOfOrigin, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        pnlRegister.add(lblGender, gbc);

        gbc.gridx = 1;
        groupGender.add(rdbtnMale);
        groupGender.add(rdbtnFemale);
        pnlGender.add(rdbtnMale);
        pnlGender.add(rdbtnFemale);
        pnlRegister.add(pnlGender, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        pnlRegister.add(lblTechnologies, gbc);

        gbc.gridx = 1;
        pnlRegister.add(pnlTechnologies, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        pnlRegister.add(lblModalidad, gbc);

        gbc.gridx = 1;
        pnlRegister.add(cmbModality, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        pnlRegister.add(btnGuardar, gbc);

        return pnlRegister;
    }

    private JDatePickerImpl createDatePicker() {
        UtilCalendarModel model = new UtilCalendarModel();
        Properties properties = new Properties();
        properties.put("text.today", "Día");
        properties.put("text.month", "Mes");
        properties.put("text.year", "Año");

        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        return new JDatePickerImpl(datePanel, new DateLabelFormatter());
    }
}
