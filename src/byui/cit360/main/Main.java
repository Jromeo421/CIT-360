/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit360.main;

import byui.cit360.controller.StudentsController;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import byui.cit360.model.StudentModel;

/**
 *
 * @author hysi-jetmir
 */
public class Main {
    
    private static ArrayList<StudentModel> students;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // Java Collections demo
            initializeJavaCollections();
            
            // MVC demo
            initializeMVC();
            
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                                    "\nCause: " + e.getCause() +
                                    "\nMessage: " + e.getMessage());
                
                e.printStackTrace();
        }
    }
    
    public static void initializeMVC() {
        // Initialize controller
        StudentsController ctrl = new StudentsController(students);
        ctrl.startApplication();
    }
    
    public static void initializeJavaCollections() {
        // Initialize collection
            students = new ArrayList<>();
            initializeAndLoadStudents();
        
            // Iterate through Students collection and print each student
            printStudents();
            
            System.out.println();
            
            // Initialize student we need to find in the ArrayList
            StudentModel jackbower = new StudentModel("Jack", null, "Bower", 
                    getDate(1,5,1970), "Paris, France");
            
            // Loop through Students collection to find our student
            findStudent(jackbower);
            
            System.out.println();
    }

    public static void initializeAndLoadStudents() {
        
        // Add collection elements
        students.add(new StudentModel("Jack", null, "Bower", getDate(1,5,1970), 
                "Los Angeles, CA, United States"));
        students.add(new StudentModel("Clark", "Kal-El", "Kent", getDate(2,29,1960), 
                "Smallville, KS, United States"));
        
        StudentModel batman = new StudentModel();
        batman.setFirstName("Bruce");
        batman.setLastName("Wayne");
        batman.setDateOfBirth(getDate(5,18,1939));
        batman.setPlaceOfBirth("Gotham City, NY, United States");
        
        StudentModel spiderman = new StudentModel();
        spiderman.setFirstName("Peter");
        spiderman.setLastName("Parker");
        spiderman.setDateOfBirth(getDate(3,1,1962));
        spiderman.setPlaceOfBirth("Queens, NY, United States");
        
        students.add(batman);
        students.add(spiderman);
    }
    
    // Iterate through collection and print its elements
    public static void printStudents() {
        
        Iterator iterator = students.iterator();
        
        while(iterator.hasNext()) {
            StudentModel student = (StudentModel)iterator.next();
            System.out.println(student);
        }
    }
    
    // Loop through collection and find matching elements
    public static void findStudent(StudentModel studentToFind) {
        
        for (int i = 0; i < students.size(); i++) {
            
            StudentModel currentStudent = students.get(i);
            if (studentToFind.equals(currentStudent)) {
                System.out.println("Student match found...");
                System.out.println("Student " + currentStudent.getFirstName() + 
                        currentStudent.getLastName() +
                        " and " + studentToFind.getFirstName() + 
                        studentToFind.getLastName() + " are equal.");
            }
        }
    }
    
    // Returns a Date object given the month, day, and year
    private static Date getDate(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 9);
        cal.set(Calendar.DATE, 24);
        cal.set(Calendar.YEAR, 2013);
        
        // Reset time, not needed for this exercise
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
    
}
