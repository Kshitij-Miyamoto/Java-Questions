import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr;
        arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){//this loop is basically to iterate through the array
            arr[i] = in.nextInt();
        }
       // for(int i = 0 ; i < arr.length; i++){//this loop is basically to print the result
           // System.out.print(arr[i]);
        for (int j : arr) {//this loop is basically to print the result
            System.out.print( j + " ");
        }

    }
}
