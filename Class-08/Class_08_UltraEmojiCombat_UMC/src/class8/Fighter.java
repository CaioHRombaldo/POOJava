/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8;

/**
 *
 * @author CaioHRombaldo
 */
public class Fighter {
    
    // Fighter attributes.
    private String name;
    private String nacionality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int victories, defeats, ties;

    // Fighetr Special methods.
    // Here we will not ask for the category parameter, because when passing the weight it will already define the category.
    public Fighter(String name, String nacionality, int age, float height, float weight, int victories, int defeats, int ties) {
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victories = victories;
        this.defeats = defeats;
        this.ties = ties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getNacionality() {
        return nacionality;
    }
    
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }
    
    // Here we use the setWeight method to automatically set the category.
    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }
    
    public String getCategory() {
        return category;
    }

    // Here we will check the weight and define the current category.
    private void setCategory() {
        if(this.getWeight() < 52.2){
            this.category = "invalid";
        } else if(this.getWeight() <= 70.3) {
            this.category = "Lightweight";
        } else if(this.getWeight() <= 83.9) {
            this.category = "Middleweight";
        } else if(this.getWeight() <= 120.2) {
            this.category = "Heavyweight";
        } else {
            this.category = "invalid";
        }
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }
    
    
    // Custom methods.
    public void introduceFighter(){
        System.out.println("-----------------------------");
        System.out.println("Fighter: " + this.getName());
        System.out.println("From: " + this.getNacionality());
        System.out.println(this.getAge() + " years old");
        System.out.println(this.getHeight() + " meters tall");
        System.out.println("wighing " + this.getWeight() + "Kg");
        System.out.println("Has won " + this.getVictories() + " fights");
        System.out.println("It lost " + this.getDefeats() + " fights");
        System.out.println("Tied " + this.getTies() + "fights");
    }
    
    public void status(){
        System.out.println("--------------");
        System.out.println(this.getName());
        System.out.println("It's a " + this.getCategory());
        System.out.println("Victories: " + this.getVictories());
        System.out.println("Defeats: " + this.getDefeats());
        System.out.println("Ties: " + this.getTies());
    }
    
    public void winFight(){
        this.setVictories(this.getVictories() + 1);
    }
    
    public void loseFight(){
        this.setDefeats(this.getDefeats() + 1);
    }
    
    public void tieFight(){
        this.setTies(this.getTies() + 1);
    }
    
}
