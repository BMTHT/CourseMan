/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseman2.model;


/**
 *
 * @author Nguyen Bach
 */
public abstract class Module {
    private String code;
    private String name;
    private int semeter;
    private int credits;

    public Module() {
    }

    public Module(String code, String name, int semeter, int credits) {
        this.code = code;
        this.name = name;
        this.semeter = semeter;
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemeter() {
        return semeter;
    }

    public void setSemeter(int semeter) {
        this.semeter = semeter;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
    
}
