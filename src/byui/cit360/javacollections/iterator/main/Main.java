/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit360.javacollections.iterator.main;

import byui.cit360.javacollections.iterator.model.Student;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author hysi-jetmir
 */
public class Main {
    
    private static ArrayList<Student> students;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
         
            // Initialize collection
            students = new ArrayList<>();
            
            // Add collection elements
            students.add(new Student("Jack", null, "Bower", getDate(1,5,1970), "Los Angeles, CA, United States"));
            students.add(new Student("Clark", "Kal-El", "Kent", getDate(2,29,1960), "Smallville, KS, United States"));
            
            Student batman = new Student();
            batman.setFirstName("Bruce");
            batman.setLastName("Wayne");
            batman.setDateOfBirth(getDate(5,18,1939));
            batman.setPlaceOfBirth("Gotham City, NY, United States");
            
            Student spiderman = new Student();
            spiderman.setFirstName("Peter");
            spiderman.setLastName("Parker");
            spiderman.setDateOfBirth(getDate(3,1,1962));
            spiderman.setPlaceOfBirth("Queens, NY, United States");
            
            students.add(batman);
            students.add(spiderman);
            
            // Get collection iterator
            Iterator iterator = students.iterator();

            // Iterate through collection and print its elements
            while(iterator.hasNext()) {
               Student student = (Student)iterator.next();
               System.out.println(student);
            }
            
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                                    "\nCause: " + e.getCause() +
                                    "\nMessage: " + e.getMessage());
                
                e.printStackTrace();
        }
    }
    
    // Returns a Date object given the month, day, and year
    private static Date getDate(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 9);
        cal.set(Calendar.DATE, 24);
        cal.set(Calendar.YEAR, 2013);
        
        return cal.getTime();
    }
    
}
