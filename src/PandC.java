//to write a program to perform permutation and combination 
import java.util.Scanner;
public class PandC
{
    static int factorial(int n)
    {
        if(n==0||n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
    static int nCr(int n,int r)
    {
        if(r==0||r==n)
        return 1;
        else
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    static int nPr(int n, int r)
    {
        if(r==0)
        return 1;
        else
        return factorial(n)/factorial(n-r);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Option 1 or 2 (1:For Combination nCr & 2:For Permutation nPr)");
        Scanner sc = new Scanner(System.in);
        int val= sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        switch(val)
        {
            case 1:
            if(n>=r)
            {
                System.out.println("nCr =" + nCr(n, r));
            }
            else
            {
                System.out.println("Invalid Input!!!!!");
            }
            break;
            case 2:
            if(n>=r)
            {
                System.out.println("nPr ="+nPr(n, r));
            }
            else
            {
                System.out.println("Invalid Input!!!!!");
            }
            break;
            default:
            System.out.println("Enter a valid choice 1 or 2");

        }
    }
}