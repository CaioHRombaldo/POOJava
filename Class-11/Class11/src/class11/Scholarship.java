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
public class Scholarship extends Student {
    
    // Scholarship attributes:
    private int scholarship;
    
    
    // Scholharship custom methods:
    public void renewScholarship(){
        
    }
    // Here we override a method of our mother class.
    @Override
    public void payMonthlyFee(){
        System.out.println("Scholarship fee paid!");
    }
    
    // Scholharship special methods:
    public Scholarship(String name, int age, String gender, String course, int scholarship) {
        super(name, age, gender, course);
        this.scholarship = scholarship;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
    
}
