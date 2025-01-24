package com.entrecodigosycafe.studentapp.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class StudentView extends JFrame {

    public StudentView() {
        setTitle("Listado de Estudiantes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        add(contentList());
        setVisible(true);

    }

    private JPanel contentList () {

        String[] columnNames = {"id", "nombre", "apellido", "edad", "pais", "correo", "celular"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);;
        JTable table = new JTable(tableModel);

        JPanel pnlList = new JPanel();
        pnlList.setBackground(new Color(232, 249, 255));
        pnlList.setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("Listado de Estudiantes");

        JScrollPane scrollPane = new JScrollPane(table);
        pnlList.add(lblTitle, BorderLayout.NORTH);
        pnlList.add(scrollPane, BorderLayout.CENTER);
        return pnlList;

    };

}
