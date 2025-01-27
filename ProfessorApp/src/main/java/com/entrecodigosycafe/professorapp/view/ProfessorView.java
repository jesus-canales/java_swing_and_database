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
        this.setSize(700, 500);
        this.setResizable(false);

        this.add(contentRegister());
        this.setVisible(true);
    }

    private JPanel contentRegister () {
        JPanel pnlRegister = new JPanel();
        pnlRegister.setBackground(new Color(179, 200, 207));
        pnlRegister.setLayout(new GridBagLayout());

        JLabel lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField();

        JLabel lblApellido = new JLabel("Apellido: ");
        txtApellido = new JTextField();

        JLabel lblDate = new JLabel("Fecha: ");
        datePicker = createDatePicker();

        JLabel lblPlaceOfOrigin = new JLabel("Lugar de procedencia: ");
        String[] places = {"Seleccione", "Lima", "Chiclayo", "Piura", "Arequipa"};
        cmbPlaceOfOrigin = new JComboBox<>(places);

        JLabel lblGender = new JLabel("Género: ");
        JPanel pnlGender = new JPanel();
        rdbtnMale = new JRadioButton("Masculino");
        rdbtnFemale = new JRadioButton("Femenino");
        ButtonGroup groupGender = new ButtonGroup();
        groupGender.add(rdbtnMale);
        groupGender.add(rdbtnFemale);
        pnlGender.add(rdbtnMale);
        pnlGender.add(rdbtnFemale);

        JLabel lblTechnologies = new JLabel("Tecnologías: ");
        JPanel pnlTechnologies = new JPanel();
        chbJava = new JCheckBox("Java");
        chbPython = new JCheckBox("Python");
        chbJavaScript = new JCheckBox("JavaScript");
        chbSQL = new JCheckBox("SQL");
        pnlTechnologies.add(chbJava);
        pnlTechnologies.add(chbPython);
        pnlTechnologies.add(chbJavaScript);
        pnlTechnologies.add(chbSQL);

        JLabel lblModalidad = new JLabel("Modalidad: ");
        String[] modalities = {"Presencial", "Remoto", "Híbrido"};
        cmbModality = new JComboBox<>(modalities);

        btnGuardar = new JButton("Guardar");

        pnlRegister.add(lblNombre);
        pnlRegister.add(txtNombre);
        pnlRegister.add(lblApellido);
        pnlRegister.add(txtApellido);
        pnlRegister.add(lblDate);
        pnlRegister.add(datePicker);
        pnlRegister.add(lblPlaceOfOrigin);
        pnlRegister.add(cmbPlaceOfOrigin);
        pnlRegister.add(lblGender);
        groupGender.add(rdbtnMale);
        groupGender.add(rdbtnFemale);
        pnlGender.add(rdbtnMale);
        pnlGender.add(rdbtnFemale);
        pnlRegister.add(pnlGender);
        pnlRegister.add(lblTechnologies);
        pnlRegister.add(pnlTechnologies);
        pnlRegister.add(lblModalidad);
        pnlRegister.add(cmbModality);
        pnlRegister.add(btnGuardar);

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
