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
    
    public void menu(){
        int chooseVar = Integer.parseInt(showMenu());
        System.out.println(chooseVar);
        
        switch(chooseVar){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option!\nTry Again.", "ERROR: Invalid", JOptionPane.ERROR_MESSAGE);
                menu();
        }
        
        
    }
    
    public String showMenu(){
        String menuText = "----CENTRAL-BANK----\n[1] Open Account\n[2] Close Account\n[3] Manage Account\n[4] Exit";
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
    
    
    
}
