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
// Here we will create our root class:
// This class is abstract so it cannot be instantiated as an object,
// but your children can.
public abstract class People {
    
    // People attributes:
    private String name;
    private int age;
    private String gender;
    
    
    // People custom methods:
    // This method cannot be changed by the children or descendants of that class.
    public final void makeBirthday(){
        this.setAge(this.getAge() + 1);
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    
    
    // People special methods:
    public People(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
    
}
