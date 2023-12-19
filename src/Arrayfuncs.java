
import java.util.Arrays;
public class Arrayfuncs{
    public static void main(String[] args){
        
        int[] marks = new int[3];
        marks[0]= 98;
        marks[1]= 99;
        marks[2]= 93;
        //lenght
        System.out.println(marks.length);

        //sort
        //before sort 98
        System.out.println(marks[0]);
        Arrays.sort(marks);
        //after sort 93
        System.out.println(marks[0]);
    }  
}
