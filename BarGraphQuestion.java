import java.util.Scanner;

public class BarGraphQuestion {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr ;
        arr = new int[n];
        for(int i = 0 ; i<arr.length; i++){ //Here we help us to get the inputs.
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
        for(int floor = max; floor >= 1 ; floor--){
            for(int i = 0 ; i < arr.length; i++){
            if(arr[i] >= floor){
                System.out.print("*\t");
            }else{
                System.out.print(" \t");
            }

        }
            System.out.println();
    }
}
}
