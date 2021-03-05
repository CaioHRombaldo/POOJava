/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import javax.swing.JOptionPane;

/**
 *
 * @author CaioHRombaldo
 */
public class Exercise {
    
     public static boolean exitSignal = false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int numAccCurrent = 0;
            String nameAccCurrent = null;
        
            MenuController mC = new MenuController();
            BankAccount bA = new BankAccount();
            
            do{
                
                nameAccCurrent = mC.chooseNameAccCurrent();
                System.out.println(nameAccCurrent);
                
            }while(nameAccCurrent == null);
            
            
            do{
            
                int chooseVar = mC.menu(nameAccCurrent, numAccCurrent);

                switch(chooseVar){
                case 1:
                    String accType = mC.chooseAccType();

                    if(accType != null)
                        numAccCurrent = numAccCurrent + 1;
                        System.out.println("Numero da conta: " + numAccCurrent);
                        bA.openAccount(numAccCurrent, nameAccCurrent, accType);
                    break;

                case 2:
                    bA.closeAccount();
                    break;

                case 3:
                    mC.manageAccount(); 
                    break;

                case 4:
                    setExitSignal(true);
                    // System.out.println("EXIT");
                    break;

                default:
                    mC.invalidOption();
                }
        
            }while(exitSignal == false);
        
    }

    public static void setExitSignal(boolean exitSignal) {
        Exercise.exitSignal = exitSignal;
    }
    
}
