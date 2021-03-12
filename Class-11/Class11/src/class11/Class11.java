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
public class Class11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // This line causes an error because the class people is abstract 
        // and cannot be instantiated as an object.
        //People p1 = new People("Caio", 18, "M");
        
        // However Visitor is a child of People and can be instantiated.
        Visitor v1 = new Visitor("Caio", 18, "M");
        
        System.out.println(v1.toString());
        
        Student s1 = new Student("Gustavo", 22, "M", "Computing");
        Scholarship ss1 = new Scholarship("Julia", 19, "F", "Medicine", 50);
        
        System.out.println(s1.toString());
        s1.payMonthlyFee();
        System.out.println(ss1.toString());
        ss1.renewScholarship();
        ss1.payMonthlyFee();
        
    }
    
}
