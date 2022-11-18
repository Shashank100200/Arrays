import java.util.*;
public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size = sc.nextInt();

        //output
        int[] arr1 = new int[size];
        for(int i=0;i<size;i++){
            System.out.println(arr1[i]);
        }

    }
}
