//Write a java program to swap (exchange) first and last character of each word in the given string.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExchangeFirstAndLast
{
// create object.
    static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    String sentence, reverse;
    int size;
    // default constructor
    ExchangeFirstAndLast()
        {
            sentence="";
            reverse="";
            size=0;
        }
// create function to read sentence.
void ReadSentence()throws IOException
{

    System.out.print("Enter the sentence : ");
    sentence=br.readLine();
    size=sentence.length();

    if(sentence.charAt(size-1)!='.')
        {
        
        sentence=sentence+".";
        size=size+1;
        }
}
void exfirstlast()
{
// create string variable.
    String s1="";
    char ch;
    for(int i=0;i<size;i++)
    {
        ch=sentence.charAt(i);
        if(ch!=' ' && ch!='.')
            {
            s1=s1+ch;
            }
            else
            {
        // find length of the word.
        int l=s1.length();
        for(int j=0;j<l;j++)
        {
            // exchange the first alphabet with the last
            if(j==0)
            ch=s1.charAt(l-1);
            // exchange the last alphabet with the first
            else if(j==(l-1))
            ch=s1.charAt(0);
            else
            ch=s1.charAt(j);
            reverse=reverse+ch;
        }
        reverse=reverse+" ";
        s1="";
        }
    }
}
// create display function.
void display()
    {
    System.out.println("The Original Sentence is : "+sentence);
    System.out.println("The Changed Sentence is : "+reverse);
    }
public static void main(String args[])throws IOException
    {
    ExchangeFirstAndLast ob=new ExchangeFirstAndLast();
    ob.ReadSentence();
    ob.exfirstlast();
    ob.display();
    }
}