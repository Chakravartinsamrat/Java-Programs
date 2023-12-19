import java.util.Scanner;
class Balance extends Exception{
    String message;
    public Balance(String message)
    {
        this.message= message;
    }
    @Override
    public String toString()
    {
        return message;
    }
}
public class UserDefinedException {
    static double current_balance;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount to Deposit: ");
        current_balance= sc.nextInt();
        System.out.println("Enter amount to Withdrawal :");
        int n= sc.nextInt();
        try{
            if(current_balance<n)
            {
                throw new Balance("Insufficient Funds! \t Your current Balance is: "+ current_balance);
            }
            else
            System.out.println("Please Take The Money: " + n);
            current_balance = current_balance-n;
            System.out.println("Balance available after withdrawl: "+ current_balance);
        }
        catch(Balance mab)
        {
            mab.printStackTrace();
        }
    }   
}
