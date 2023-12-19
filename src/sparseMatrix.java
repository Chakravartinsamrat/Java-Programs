import java.util.Scanner;
public class sparseMatrix 
{
    public static void main(String[] args) {
        {
            int m,n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of Rows ");
            m= sc.nextInt();
            System.out.println("Enter the number of columns: ");
            n= sc.nextInt();
            int a[][] = new int[m][n];
            System.out.println("Enter all the values of Matrix :");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]= sc.nextInt();
                }
            }
            System.out.println("Matrix: ");
            for(int i=0; i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println(a[i][j]+" ");
                }
                System.out.println(" ");
            }
            int size =m*n;
            int count =0;
            int sum=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if (a[i][j]==0)
                    {
                        count ++;
                    }
                    else
                    sum= sum+a[i][j];
                }
            }
            if(count>(size/2))
            System.out.println("Its a sparse Matrix and the sum is" + sum);
            else
            System.out.println("It's not a sparse matrix");
        }
    }
    
}
