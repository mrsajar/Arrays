import java.util.Scanner;
public class Number_of_occurrence {
    public static void main(String[] args) {
        int counter=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of arary..");
        int n = in.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the element of array..");
        for(int i=0;i< array.length;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Enter the element you want to occurrence..");
        int Element=in.nextInt();
        for(int i=0;i< array.length;i++) {
            if (array[i] == Element) {
                counter++;
            }
        }
        System.out.println("the occurrence of the element is"  +  Element+" this.."+counter);
    }
}
