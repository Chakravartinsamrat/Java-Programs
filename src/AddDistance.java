///to Write a program to convert and display distance in feet and inches
import java.util.Scanner;
public class AddDistance 
{
    int feet;
    int inches;
    public void Read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Distance in feet");
        feet = sc.nextInt();
        System.out.println("Enter the distance in inches");
        inches= sc.nextInt();
    }
    public void display()
    {
        System.out.println("Feet:"+feet + "\t Inches:"+inches);
    }
    public void Addition( AddDistance D1, AddDistance D2)
    {
        inches=D1.inches + D2.inches;
        feet= D1.feet + D2.feet +(inches/12) ;
        inches=inches%12;
    }
    public static void main(String[] args) 
    {
        while (true)
        { 
        System.out.println("Enter Either 1 or 0");
        Scanner sc =new Scanner(System.in);
        int val= sc.nextInt();
        switch (val)
            {
                case 1:
                    AddDistance D1 =new AddDistance();
                    AddDistance D2 = new AddDistance();
                    AddDistance D3 = new AddDistance();
                    //read First Distance
                    System.out.println("Enter First Distance: ");
                    D1.Read();
                    //read Second Distance
                    System.out.println("Enter second Distance: ");
                    D2.Read();
                    //ADD THEM BOTH :)
                    D3.Addition(D1,D2);

                    //print Distance
                    System.out.println("Total Distance is: ");
                    D3.display();
                    break;
                case 0:
                    System.exit(0);
                default:
                System.out.println("Enter Valid Input 0 or 1");
                    break;
            }
        }
    }
}
//
