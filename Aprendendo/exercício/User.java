import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);

    private String accountNumber;
    private String accountHolder;
    private double depositValue;

    //construtor 
    public User(String accountNumber, String accountHolder, double depositValue){  
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.depositValue = depositValue;
    }

    //construtor sobrecarga 
    public User(String accountNumber, String accountHolder){  
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void accountData(){
        System.out.println("\nAccount data: ");
        System.out.println("Account: " + getAccountNumber() + ", Holder: " + getAccountHolder() + ", Balance: $ " + getDepositValue());
    }

    public void enterDepositValue(){
        System.out.println("enter a deposit value: ");
        double newDepositValue = getDepositValue();
        System.out.println(newDepositValue);
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    
    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }


    public double getDepositValue(){
        return depositValue;
    }

    public void setDepositValue(double depositValue){
        this.depositValue = depositValue;
    }
    


}
