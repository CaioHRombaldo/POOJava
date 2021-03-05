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
public class MenuController {
    
    public int menu(String nameAccCurrent, int numAccCurrent){
        int chooseVar = Integer.parseInt(showMenu(nameAccCurrent, numAccCurrent));
        System.out.println(chooseVar);
        
        return chooseVar;
    }
    
    public String showMenu(String nameAccCurrent, int numAccCurrent){
        String menuText = "----CENTRAL-BANK----\n" +
                "Hi " + nameAccCurrent + " what you want?\n" +
                "[1] Open Account\n[2] Close Account\n[3] Manage Account\n[4] Exit\n" +
                " Account Number: " + numAccCurrent;
        showConsoleMenu();
        return JOptionPane.showInputDialog(null, menuText);
    };
    
    private void showConsoleMenu(){
        System.out.println("----CENTRAL-BANK----");
        System.out.println("--------------------");
        System.out.println("[1] Open Account");
        System.out.println("[2] Close Account");
        System.out.println("[3] Manage Account");
        System.out.println("[4] Exit");
        System.out.println("--------------------");
    }
    
    public String chooseNameAccCurrent(){
        return JOptionPane.showInputDialog(null, "Please, type your name:");
    }
    
    public String chooseAccType(){
        String accTypeText = "CC = Conta Corrente\nCP = Conta Poupança";
        
        String accTypeTester = JOptionPane.showInputDialog(null, accTypeText);
        
        if(accTypeTester.equals("CC") || accTypeTester.equals("CP")){
            return accTypeTester;   
        }
        
        return null;
    }
    
    public void manageAccount(){
        
    }
    
    public void invalidOption(){
        JOptionPane.showMessageDialog(null, "Invalid Option!\nTry Again.", "ERROR: Invalid", JOptionPane.ERROR_MESSAGE);
    }
    
    
    
}
