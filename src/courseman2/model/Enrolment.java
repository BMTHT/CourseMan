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
public class Enrolment {
    private Student student;
    private Module module;
    private float internalMark;
    private float examinationMark;
    private char finalGrade;

    public Enrolment() {
    }

    public Enrolment(Student student, Module module, float internalMark, float examinationMark, char finalGrade) {
        this.student = student;
        this.module = module;
        this.internalMark = internalMark;
        this.examinationMark = examinationMark;
        this.finalGrade = finalGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public float getInternalMark() {
        return internalMark;
    }

    public void setInternalMark(float internalMark) {
        this.internalMark = internalMark;
    }

    public float getExaminationMark() {
        return examinationMark;
    }

    public void setExaminationMark(float examinationMark) {
        this.examinationMark = examinationMark;
    }

    public char getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(char finalGrade) {
        this.finalGrade = finalGrade;
    }
    
    
}
