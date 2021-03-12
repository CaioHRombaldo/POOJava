/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

/**
 *
 * @author CaioHRombaldo
 */
public class Student extends People {
    
    // Student attributes:
    private int register;
    private String course;
    
    
    // Student custom methods:
    public void payMonthlyFee(){
        System.out.println("Standard monthly fee paid!");
    }
    
    
    // Student special methods:
    public Student(String name, int age, String gender, String course) {
        super(name, age, gender);
        this.course = course;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
}
