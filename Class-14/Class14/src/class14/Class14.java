/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

/**
 *
 * @author CaioHRombaldo
 */
public class Class14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Here we can instantiate the objects of our classes 
        // and test their methods:
        
        Video v[] = new Video[3];
        
        v[0] = new Video("OOP Class 01");
        v[1] = new Video("OOP Class 02");
        v[2] = new Video("OOP Class 03");
        
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        Student s[] = new Student[2];
        
        s[0] = new Student("juba", "Jubileu", 19, "M");
        s[1] = new Student("creuzita", "Creuza", 21, "F");
        
        System.out.println(s[0].toString());
        System.out.println(s[1].toString());
    }
    
}
