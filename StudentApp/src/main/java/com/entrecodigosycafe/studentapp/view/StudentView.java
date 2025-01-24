package com.entrecodigosycafe.studentapp.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class StudentView extends JFrame {

    private JTable table;
    private DefaultTableModel tableModel;

    public StudentView() {
        setTitle("Listado de Estudiantes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);

        add(contentList());
        setVisible(true);

    }

    private JPanel contentList () {

        String[] columnNames = {"id", "nombre", "apellido", "edad", "pais", "correo", "celular"};
        tableModel = new DefaultTableModel(columnNames, 0);;
        table = new JTable(tableModel);

        JPanel pnlList = new JPanel();
        pnlList.setBackground(new Color(232, 249, 255));
        pnlList.setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("Listado de Estudiantes", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTitle.setBorder(new EmptyBorder(20, 0, 20,0));

        JScrollPane scrollPane = new JScrollPane(table);
        pnlList.add(lblTitle, BorderLayout.NORTH);
        pnlList.add(scrollPane, BorderLayout.CENTER);
        return pnlList;

    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
}
