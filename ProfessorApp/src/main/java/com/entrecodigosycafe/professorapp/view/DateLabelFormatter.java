package com.entrecodigosycafe.professorapp.view;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {

    private final String datePattern = "dd/MM/yyyy";
    private final SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);

    public Object stringToValue(String date) throws ParseException {
        return dateFormat.parse(date);
    }

    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormat.format(cal.getTime());
        }
        return "";
    }
}
