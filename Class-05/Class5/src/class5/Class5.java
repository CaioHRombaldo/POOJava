/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

/**
 *
 * @author CaioHRombaldo
 */
public class Class5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Here, we instantiate a new account using the account number and name as a parameter.
        BankAccount c1 = new BankAccount(123, "Jubileu");
        BankAccount c2 = new BankAccount(321, "Creuza");
        
        // Here we open the account by passing the account type as a parameter.
        c1.openAccount("CC");
        c2.openAccount("CP");
        
        // Here we tested some custom methods that we created in the bank class:
        // c1.deposit(100);
        // c1.closeAccount();
        // c1.withdraw(150);
        //c1.closeAccount();
        
        //c1.monthlyPayment();
        //c2.monthlyPayment();
        
        // Here we show the current status of the attributes on the console.
        c1.accStatus();
        c2.accStatus();
        
        
        
    }
    
}
