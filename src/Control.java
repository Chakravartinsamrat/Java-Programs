/*Write a Java program to Demonstrate Comparator interface and Array list to
sort student’s information by considering student names and students roll
number.*/

import java.util.*;
// create the Student class
class Student1
{
 int srn;
 String name;
 // constructor
 Student1(int srn, String name)
 {
 this.srn = srn;
 this.name = name;
 }
}

// creates the comparator for comparing srn value
class StudentComparator implements Comparator<Student1>
{
 // override the compare() method
 public int compare(Student1 s1, Student1 s2)
 {
 if (s1.srn == s2.srn)
 return 0;
 else if (s1.srn > s2.srn)
 return 1;
 else
 return -1;
 }
}

public class Control
{
 public static void main(String[] args)
 {
 // create the ArrayList object
 int n;
 System.out.println("Enter the Number student details you want to sort");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 ArrayList<Student1> s = new ArrayList<Student1>();
 for(int i=0;i<n;i++)
 {
 System.out.println("Enter the SRN");
 int srn=sc.nextInt();
 System.out.println("Enter the name");
 String name=sc.next();
 s.add(new Student1(srn, name));
 }
 System.out.println("before sorting");
 for (Student1 st : s)
 {
 System.out.println(st.srn + " " + st.name
 + " " );
 }
 System.out.println();

 System.out.println(
 "After sorting(sorted by SRN)");

 // call the sort function
 Collections.sort(s, new StudentComparator());
 for (Student1 st : s)
 {
 System.out.println(st.srn + " " + st.name
 + " " );
 }
 }
}