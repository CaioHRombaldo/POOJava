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
public class Class8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Here we instantiate our fighters as a composite object.
        Fighter f[] = new Fighter[6];
                f[0] = new Fighter("Pretty Boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
                f[1] = new Fighter("Putscript", "Brazil", 29, 1.68f, 57.8f, 14, 2, 3);
                f[2] = new Fighter("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
                f[3] = new Fighter("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
                f[4] = new Fighter("UFOCobol", "Brazil", 37, 1.70f, 119.3f, 5, 4, 3);
                f[5] = new Fighter("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
                
        // Here we can test the methods of our fighter class.
        
        //f[5].winFight();
        //f[4].loseFight();
        //f[3].tieFight();
        
        //for(int i = 0; i < 6; i += 1){
        //    f[i].introduceFighter();
        //    f[i].status();
        //}
        
        
        // Here we will instantiate a new fight.
        // Ultimate Emoji Combat
        Fight UEC01 = new Fight();
        
        // Here we will schedule a new fight,
        // passing the challenger and the challenged as parameters.
        UEC01.scheduleFight(f[0], f[1]);
        
        // Here we will try to start the fight.
        UEC01.startFight();
        
        // Here we check the status of the fighters after the fight.
        f[0].status();
        f[1].status();
    }
    
}
