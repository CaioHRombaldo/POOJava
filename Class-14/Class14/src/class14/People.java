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
public abstract class People {
    
    // People attributes:
    protected String name;
    protected int age;
    protected String gender;
    protected float experience;
    
    
    // People custom methods:
    protected void earnExp(){
        
    }
    
   
    // People Override methods:
    @Override
    public String toString() {
        return "People{" + "name=" + name + 
                ", age=" + age + 
                ", gender=" + gender + 
                ", experience=" + experience + '}';
    }
    
    
    // People special methods:
    public People(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experience = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
    
}
