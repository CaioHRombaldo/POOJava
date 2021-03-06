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
public class BankAccount {
    
    // Bank Account Attributes:
    public int accNumber;
    protected String accType;
    private String accOwner;
    private float accBalance;
    private boolean accStatus;
    
    
    // Bank Account Custom Methods:
    public void openAccount(String type){
        // Here we open the account by changing its status to true.
        this.setAccStatus(true);
        
        // We also put the type received in the account variable 
        this.setAccType(type);
        
        // and check which type of account.
        if (this.getAccType().equals("CC")) {
            this.setAccBalance(50);
        } else if(this.getAccType().equals("CP")) {
            this.setAccBalance(150);
        }
        
    }
    
    public void closeAccount(){
        // Here we check the balance
        // we cannot close an account with a balance or debit.
        if (this.getAccBalance() > 0) {
            System.out.println("ERROR. You need to withdraw all the money before closing the account!");
        } else if (this.accBalance < 0) {
            System.out.println("ERROR. You need to pay all the debt before closing the account!");
        } else {
            // If there is no balance the account is closed changing the status to false.
            this.setAccStatus(false);
        }
    }
    
    public void deposit(float amount){
        // Here we verify that the account status is true (open).
        if(this.getAccStatus())
            // Here we deposit the amount received in the method.
            this.setAccBalance(this.getAccBalance() + amount);
    }
    
    public void withdraw(float amount){
        // Here we verify that the account status is true (open).
        if(this.getAccStatus())
            // Here we check if the account balance is equivalent to the amount.
            if(this.getAccBalance() >= amount)
                // If it is equivalent we withdraw the value
                this.setAccBalance(this.getAccBalance() - amount);
    }
    
    public void monthlyPayment(){
        // Local variable that will keep the monthly fee after the account type test.
        int mPAmount = 0;
        
        if (this.getAccType().equals("CC")) {
            mPAmount = 12;
        } else if (this.getAccType().equals("CP")) {
            mPAmount = 20;
        }
        // Here we collect payment
        this.withdraw(mPAmount);
    }
    
    public void accStatus(){
        // This method will show us the current account status on the console.
        System.out.println("----------------------------------------");
        System.out.println("Account number:" + this.getAccNumber());
        System.out.println("Account type:" + this.getAccType());
        System.out.println("Account owner:" + this.getAccOwner());
        System.out.println("Account balance:" + this.getAccBalance());
        System.out.println("Account status:" + this.getAccStatus());
    }
    
    
    // Special method Constructor:
    public BankAccount(int num, String name) {
        // Here we define some parameters for the initialization of the account. 
        // (closed and without balance)
        this.setAccStatus(false);
        this.setAccBalance(0);
        
        // Here we define the account number and name based on the parameter received when instantiating the object.
        this.setAccNumber(num);
        this.setAccOwner(name);
        
    }
    
    
    // Special methods (Setters and Getters):
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

    public float getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(float accBalance) {
        this.accBalance = accBalance;
    }

    public boolean getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(boolean accStatus) {
        this.accStatus = accStatus;
    }
    
    
    
}
