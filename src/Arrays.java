public class Arrays {
    public static void main(String[] args){
        int age =30;
        int phy= 98;
        int chem=99;
        int english= 93;

        int[] marks = new int[10];
        marks[0]= 98;
        marks[1]= 99;
        marks[2]= 93;
        // Without specific index it will print location of array
        System.out.println(marks);
        // Specify index to get marks
        System.out.println(marks[2]);
        System.out.println(marks[1]);
    }
}
