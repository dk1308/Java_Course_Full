
package model;

import java.io.Serializable;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student implements Serializable{
    private int id;
    private String name;
    private boolean gender;
    private Date dob;

//--------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + getGender() + ", dob=" + getDob() + '}';
    }
    
//----------------------------------------------------------------------   
    public Student(Student s){
        this(s.id,s.name,s.gender,s.dob);
    }
//----------------------------------------------------------------------   
    public Student() {
    }
//----------------------------------------------------------------------------
    public Student(int id, String name, boolean gender, Date dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }
//---------------------------------------------------------------------------
    public Student(int id, String name, String gender, String dob){
        this.id=id;
        this.name=name;
        this.gender=gender.equals("M");
        setDob(dob);
    }
//---------------------------------------------------------------------------    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender?"Male":"Female";
    }

    public void setGender(String gender) {
        this.gender = gender.equals("M");
    }

    public String getDob() {
        SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
        return sd.format(dob);
    }

    public void setDob(String dob) {
        SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dob = new Date(sd.parse(dob).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Wrong data format!!!");
        }
    }
}
