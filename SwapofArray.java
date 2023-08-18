import java.util.Arrays;
import java.util.Scanner;

//In this program we swap the elements of an array
public class SwapofArray {
    public static void swap(int []arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
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

        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        }
    }
