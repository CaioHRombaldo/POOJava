/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10;

/**
 *
 * @author CaioHRombaldo
 */
// Here we define our class as a daughter of "People", 
// so she will receive her attributes and methods.
public class Student extends People {
    
    // Student attributes:
    private int registration;
    private String course;
    
    
    // Student custom methods:
    public void cancelRegistration(){
        System.out.println("Registration will be canceled!");
    }
    
    
    // Student special methods:
    public Student(String name, int age, String gender, String course){
        // The "super" line refers to the code we received from the mother class.
        super(name, age, gender);
        // The "super" line refers to the code we received from the mother class.
        this.course = course;
    }
    
    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    } 
    
}
