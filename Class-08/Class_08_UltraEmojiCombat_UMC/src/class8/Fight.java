/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8;

import java.util.Random;

/**
 *
 * @author CaioHRombaldo
 */
public class Fight {
    
    // Fight attributes.
    
    // Here we create an aggregate relationship
    // defining the types of the attributes as an object of the class "fighter".
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;
    
    
    // Custom methods.
    // cr = challenger // cd = challenged
    public void scheduleFight(Fighter cr, Fighter cd){
        // Here we do some checks before marking the fight as approved.
        if (cr.getCategory() == cd.getCategory() && cr != cd) {
            
            this.setChallenger(cr);
            this.setChallenged(cd);
            this.setApproved(true);
            
            System.out.println("Fight between " + this.getChallenger().getName() +
                    " and " + this.getChallenged().getName() + " approved !!!");
            
        } else {
            
            this.setChallenger(null);
            this.setChallenged(null);
            this.setApproved(false);
            
            System.out.println("ERROR! It is not possible to schedule this fight!");
        
        }
        
    }
    
    public void startFight(){
        // Here we check if the fight was approved.
        if(this.getApproved()){
            this.getChallenger().introduceFighter();
            this.getChallenged().introduceFighter();
            
            // Here we will generate a random number from 0 to 2 
            // to define the result of the fight.
            Random rand = new Random();
            int result = rand.nextInt(3);
            // Print rand result for debbug.
            // System.out.println(result);

            
            switch(result){
                case 0:
                    this.getChallenger().tieFight();
                    this.getChallenged().tieFight();
                    break;
                case 1:
                    this.getChallenger().winFight();
                    this.getChallenged().loseFight();
                    break;
                case 2:
                    this.getChallenger().loseFight();
                    this.getChallenged().winFight();
                    break;
                default:
                    System.out.println("ERROR! Invalid fight result! try again!");
            }
            
            // Calls the method that shows the result on the console.
            this.resultPrint(result);
            
        } else{
            
            System.out.println("Error! The fight cannot start because it is not approved!");
        
        }
        
    }
    
    // For a better organization, this method shows the winner on the console.
    private void resultPrint(int result){
        System.out.println("--------Result--------");
        switch(result){
            case 0:
                System.out.println("-------TIE!-------");
                break;
            case 1:
                System.out.println("-CHALLENGER--WIN!-");
                System.out.println(this.getChallenger().getName());
                break;
            case 2:
                System.out.println("-CHALLENGED--WIN!-");
                System.out.println(this.getChallenged().getName());
                break;
        }
        
    }
    
    
    //Special methods.
    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
    
}
