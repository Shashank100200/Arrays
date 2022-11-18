import java.util.*;
public class arrayInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];

        //input
        for(int i=0;i<size;i++) {
            System.out.println("Enter the value of array :");
            arr1[i] = sc.nextInt();
        }
        //output
        for(int i=0;i<size;i++){
            System.out.println(arr1[i]);
        }
    }
}
