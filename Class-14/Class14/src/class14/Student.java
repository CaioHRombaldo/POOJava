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
public class Student extends People {
    
    // Student attributes:
    private String login;
    private int totWatched;
    
    
    // Student custom methods:
    public void watchedOneMore(){
        
    }
    
    
    // Student Override methods:
    @Override
    public String toString() {
        return "-----------------\n" + "Student{\n" + super.toString() + "\nlogin=" + login + 
                ", totWatched=" + totWatched + '}';
    }
    
    
    // Student special methods:
    public Student(String login, String name, int age, String gender) {
        super(name, age, gender);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotWatched() {
        return totWatched;
    }

    public void setTotWatched(int totWatched) {
        this.totWatched = totWatched;
    }
    
}
