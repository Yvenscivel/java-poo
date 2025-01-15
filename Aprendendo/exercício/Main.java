import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // inserção de dados para os parametros do objeto: User(accountNumber, ..., ...);
        System.out.println("Enter account number: ");
        String accountNumber = sc.nextLine();

        // inserção de dados para os parametros do objeto: User(..., accountHolder, ...);
        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();

        // verificador para a condicional
        System.out.println("Is there an initial deposit (y/n)? ");
        char addDeposit = sc.nextLine().charAt(0);

        
        if(addDeposit == 'y' ){
            // inserção de dados para os parametros do objeto: User(..., ..., depositValue);
            System.out.println("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();

            User u = new User(accountNumber, accountHolder, depositValue);
            u.accountData();
            System.out.println("Enter a deposit value: ");
            double newDepositValue = sc.nextDouble();
            depositValue = depositValue + newDepositValue;
            u.setDepositValue(depositValue);
            System.out.println("Update account data: ");
            u.accountData();

            System.out.println("Enter a withdraw value: ");
            newDepositValue = sc.nextDouble();
            depositValue = (depositValue - newDepositValue) - 5;
            u.setDepositValue(depositValue);
            System.out.println("Update account data: ");
            u.accountData();

        }
        else if(addDeposit == 'n'){
            User u = new User(accountNumber, accountHolder);
            u.accountData();
            System.out.println("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            u.setDepositValue(depositValue);
            u.accountData();

            System.out.println("Enter a withdraw value: ");
            double newDepositValue = sc.nextDouble();
            depositValue = (depositValue - newDepositValue) - 5;
            u.setDepositValue(depositValue);
            System.out.println("Update account data: ");
            u.accountData();

        }
        else{
            System.out.println("error, insert just y or n");
        }

        sc.close();
    }
}
