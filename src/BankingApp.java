import java.util.Scanner;
class BankingSystem
{
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);
    public void openAccount()
    {
        System.out.println("Enter account number:");
        accno =sc.next();
        System.out.println("Enter account name: ");
        name = sc.next();
        System.out.println("Enter the account Type: ");
        acc_type = sc.next();
        System.out.println("Enter Account Balance :");
        balance = sc.nextLong();
    }
    public void DisplayAccount()
    {
        System.out.println("Name of Acc Holder: "+name);
        System.out.println("Account Number: "+accno);
        System.out.println("Account Type :"+ acc_type);
        System.out.println("Available Balance: "+balance);
    }
    void deposit()
    {
        long amount;
        System.out.println("Enter the amount to depost:");
        amount = sc.nextLong();
        balance = balance+amount;
    }
    public void withdrawl()
    {
        long amount;
        System.out.println("Enter the amouth to withdraw :");
        System.out.println("Balance available to Withdraw: "+balance);
        amount= sc.nextLong();
        if(amount<=balance)
        {
            balance= balance-amount;
            System.out.println("Balance after Withdrawl: "+balance);
        }
        else{
            System.out.println("Withdrawal Amount exceeds the Balance"+"\tTranscation Failed!!!");
        }
    }
    public boolean search(String acc_no)
    {
        if(accno.equals(acc_no))
        {
            DisplayAccount();
            return (true);
        }
        return (false);
    }
}
public class BankingApp
{   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Customers to Input:");
        int n = sc.nextInt();
        BankingSystem C[] = new BankingSystem[n];
        for(int i=0; i<C.length;i++)
        {
            C[i]=new BankingSystem();
            C[i].openAccount();
        }
        int ch;
        do{
            System.out.println("\n _____Banking System Application Wizard_____");
            System.out.println("1. Display all Accounts \n 2. Search by Account Number \n 3.Deposit the Amount  \n 4. Withdraw the amount \n 5. Exit");
            System.out.println("Enter your choice: ");
            ch= sc.nextInt();
            switch(ch)
            {
                case 1:
                for(int i=0; i<n; i++)
                {
                    C[i].DisplayAccount();
                }
                break;
                case 2:
                System.out.println("Enter the account number you want to Search :");
                String acc_no = sc.next();
                boolean found = false;
                for(int i=0; i<C.length;i++)
                {
                    found = C[i].search(acc_no);
                    if(found)
                    {
                        break;
                    }
                    if(!found)
                    {
                        System.out.println("Search Failed!!! \t Account does not Exist...!!!");
                    }
                break;
                }
                case 3:
                System.out.println("Enter Account Number: ");
                acc_no = sc.next();
                found= false;
                for(int i=0;i<C.length;i++)
                {
                    found = C[i].search(acc_no);
                    if(found)
                    {
                        C[i].deposit();
                        break;
                    }
                    if(!found)
                    {
                        System.out.println("Search failed!!!! \t Account Does not exist!!!");
                    }
                    break;
                }
                case 4:
                System.out.println("Enter account number: ");
                acc_no = sc.next();
                found =false;
                for(int i=0;i<C.length;i++)
                {
                    found =C[i].search(acc_no);
                    if(found)
                    {
                        C[i].withdrawl();
                        break;
                    }
                    if(!found)
                    {
                        System.out.println("Search Failed !!!! \t Account does not exist!!!");
                    }
                break;
                }
                case 5:
                System.out.println("Seee you soon.... :)");
                break;
            }
        }
        while(ch!=5);
    }
}
