/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit360.controller;

import byui.cit360.model.StudentModel;
import byui.cit360.view.StudentsView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hysi-jetmir
 */
public class StudentsController {
    private ArrayList<StudentModel> model;
    
    public StudentsController(ArrayList<StudentModel> model) {
        this.model = model;
    }
    public void startApplication() {
        // Set table column names
        String col[] = {"First Name","Middle Name","Last Name", "Date of Birth", 
            "Place of Birth"};
        
        // Initialize tableModel to populate
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        
        // Populate model (array of students) to tableModel
        Object rowData[] = new Object[5];
        for (int i = 0; i < model.size(); i++) {
            rowData[0] = model.get(i).getFirstName();
            rowData[1] = model.get(i).getMiddleName();
            rowData[2] = model.get(i).getLastName();
            rowData[3] = model.get(i).getDateOfBirth();
            rowData[4] = model.get(i).getPlaceOfBirth();
            tableModel.addRow(rowData);
        }
        
        // View the application's GUI
        StudentsView view = new StudentsView();
        view.jTableStudents.setModel(tableModel);
        view.setVisible(true);
    }
}
