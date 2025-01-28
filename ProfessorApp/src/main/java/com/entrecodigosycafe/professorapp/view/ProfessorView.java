package com.entrecodigosycafe.professorapp.view;

import com.entrecodigosycafe.professorapp.controller.ProfessorController;
import com.entrecodigosycafe.professorapp.service.ProfessorService;
import org.jdatepicker.JDatePanel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilCalendarModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class ProfessorView extends JFrame {

    private JTextField txtNombre, txtApellido;
    private JDatePickerImpl datePicker;
    private JComboBox<String> cmbPlaceOfOrigin, cmbModality;
    private JRadioButton rdbtnMale, rdbtnFemale;
    private JCheckBox chbJava, chbPython, chbJavaScript, chbSQL;
    private JButton btnGuardar;

    public ProfessorView() {
        ProfessorService professorService = new ProfessorService();
        this.professorController = new ProfessorController(professorService);

        this.setTitle("Registrar datos de Profesor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
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

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveProfessor();
                limpiarCampos();
            }
        });

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
    private ProfessorController professorController;


    private void saveProfessor() {
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String fechaNacimiento = datePicker.getJFormattedTextField().getText();
        String lugarProcedencia = (String) cmbPlaceOfOrigin.getSelectedItem();
        String genero = rdbtnMale.isSelected() ? "Masculino" : rdbtnFemale.isSelected() ? "Femenino": "";

        StringBuilder tecnologias = new StringBuilder();
        if (chbJava.isSelected()) tecnologias.append("Java, ");
        if (chbPython.isSelected()) tecnologias.append("Python, ");
        if (chbJavaScript.isSelected()) tecnologias.append("JavaScript, ");
        if (chbSQL.isSelected()) tecnologias.append("SQL, ");
        if (tecnologias.length() > 0) tecnologias.setLength(tecnologias.length() - 2);

        String modalidad = (String) cmbModality.getSelectedItem();
        if (nombre.isEmpty() || apellido.isEmpty() || fechaNacimiento.isEmpty() ||
                "Seleccione".equals(lugarProcedencia) || genero.isEmpty() ||
                tecnologias.length() == 0 || "Seleccione".equals(modalidad)) {
            JOptionPane.showMessageDialog(this, "Todos los datos son obligatorios", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        boolean exito = professorController.saveProfessor(nombre, apellido, fechaNacimiento, lugarProcedencia, genero, tecnologias.toString(), modalidad);

        JOptionPane.showMessageDialog(this, "Profesor registrado correctamente", "Profesor registrado", JOptionPane.INFORMATION_MESSAGE);

        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        datePicker.getJFormattedTextField().setText("");
        cmbPlaceOfOrigin.setSelectedIndex(0);
        rdbtnMale.setSelected(false);
        rdbtnFemale.setSelected(false);
        chbJava.setSelected(false);
        chbPython.setSelected(false);
        chbJavaScript.setSelected(false);
        chbSQL.setSelected(false);
        cmbModality.setSelectedIndex(0);
    }

}
