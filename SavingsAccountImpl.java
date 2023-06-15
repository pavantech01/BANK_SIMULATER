import java.util.Random;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount("Coast State Bank",3231343536L,"John Doe");
        savingsAccount.getAge();
        //savingsAccount.accountDetails();
        long acc12Number = SavingsAccount.getAccountNumber();
        SavingsAccount savingsAccount1=new SavingsAccount();
        savingsAccount1.chooseAction();



    }


}
