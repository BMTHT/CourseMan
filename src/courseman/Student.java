/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseman;

import java.util.Date;

/**
 *
 * @author Nguyen Bach
 */
public class Student {

    private String id;
    private String name;
    private Date dob;
    private String address;
    private String email;

    public Student() {
    }

    public Student(String name, Date dob, String address, String email) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.email = email;
    }
    
    
    
    public String getId() {
        return id;
    }

    public void setId(int year,int stt) {
        String id1 = "S"+(year+stt);
        this.id = id1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
