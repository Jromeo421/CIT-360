/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit360.javacollections.iterator.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author hysi-jetmir
 */
public class Student {
    
    //class instance variables
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String placeOfBirth;
    
    //default constructor
    public Student(){
        
    }
    
    //overloaded constructor
    public Student(String firstName, String middleName, String lastName, 
            Date dateOfBirth, String placeOfBirth){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
    }

    //public APIs (properties)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.middleName, other.middleName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        //if (!Objects.equals(this.placeOfBirth, other.placeOfBirth)) {
        //    return false;
        //}
        if (!Objects.equals(this.dateOfBirth, other.dateOfBirth)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student " + lastName + ", " 
                + firstName + " " 
                + (middleName != null ? middleName : "") 
                + " born on " + dateOfBirth 
                + " in " + placeOfBirth;
    }
    
}
