import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfanArray {
    public static void swap(int []arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while( start < end){
         swap( arr ,start,end);
         start++;
         end--;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("The final Answer: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = in.nextInt();
        int[] arr;
        arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
        }
        reverse(arr);
    }
}
