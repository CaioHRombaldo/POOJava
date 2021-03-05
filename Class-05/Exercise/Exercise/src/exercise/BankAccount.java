/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author CaioHRombaldo
 */
public class BankAccount {
    
    // Bank Account attributes:
    public int accNumber;
    protected String accType;
    private String accOwner;
    private double accBalance;
    private boolean accStatus;
    
    // Bank Account Constructor method.
    public BankAccount() {
        this.setAccStatus(false);
        this.setAccBalance(0.00);
        // openAccount(this.accTypeSelect);
    }

    // Bank Account attributes "setters" and "getters".
    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAccOwner() {
        return accOwner;
    }

    public void setAccOwner(String accOwner) {
        this.accOwner = accOwner;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public boolean getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(boolean accStatus) {
        this.accStatus = accStatus;
    }
    
    // Bank Account methods:
    public void openAccount(int numAccCurrent, String nameAccCurrent,String accType){
        this.setAccNumber(numAccCurrent);
        this.setAccOwner(nameAccCurrent);
        this.setAccType(accType);
        
        System.out.println("Account Number: " + this.getAccNumber());
        System.out.println("Account Owner: " + this.getAccOwner());
        System.out.println("Account Type: " + this.getAccType());
        
        if(this.getAccNumber()!= 0 && this.getAccOwner() != null && this.getAccType() != null && this.getAccStatus() == false){
            this.setAccStatus(true);
        }
        
        // System.out.println(this.getAccStatus());
        
        this.deposit(this.openingBalance(accType));
        
        System.out.println(this.getAccBalance());
    }
    
    public void closeAccount(){
        if(this.getAccBalance() != 0.00){
            System.out.println("ERROR account balance isn't equal to 0.");
        }
        else{
            this.setAccStatus(false);
        }
    }
    
    public void deposit(double amount){
        if(this.getAccStatus() == true){
            this.setAccBalance(accBalance + amount);
        }
    }
    
    public void withdraw(){
        
    }
    
    public void monthlyPayment(){
        
    }
    
    public double openingBalance(String accType){
        if(accType.equals("CP")){
            return 150.00;
        }
        return 50.00;
    }
    
    public void showAccountStatus(){
        System.out.println("Account Number: " + this.getAccNumber());
        System.out.println("Account Owner: " + this.getAccOwner());
        System.out.println("Account Type: " + this.getAccType());
        System.out.println("Account Balance: " + this.getAccBalance());
        System.out.println("Account Status: " + this.getAccStatus());
    }
    
}
