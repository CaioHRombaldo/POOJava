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

    public boolean isAccStatus() {
        return accStatus;
    }

    public void setAccStatus(boolean accStatus) {
        this.accStatus = accStatus;
    }
    
    // Bank Account methods:
    public void openAccount(String accType){
        System.out.println(accType);
        this.setAccBalance(this.openingBalance(accType));
        System.out.println(this.getAccBalance());
    }
    
    public void closeAccount(){
        
    }
    
    public void deposit(){
        
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
    
}
