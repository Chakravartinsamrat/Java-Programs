public class arrayInitialization {
    public static void main(String[] args){
        //if array values are not initialized it will display null character
        int age =30;
        int phy= 98;
        int chem=99;
        int english= 93;

        int[] marks = new int[10];
        //marks[0]= 98;
        //marks[1]= 99;
        //marks[2]= 93;
        System.out.println(marks[2]);
        //gives 0 output, data type int
        // if datatype boolean, output false
    }
}
