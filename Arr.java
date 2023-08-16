import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the space of an array: ");
        int n = in.nextInt();
        int [] arr =  new int[0];  //initalizing an array
        arr = new int[n]; // allocating space for the array.
        int max = arr[0];
        int min = arr[0];
         for(int i = 0 ; i < arr.length; i++){
             arr[i]= in.nextInt();
         }
         in.close();
        for(int i = 1 ; i < arr.length; i++){
            if( arr[i] > max){
              max = arr[i]; // the order of the max and min function does matter here
            }
            if(arr[i] < min){
                 min = arr[i];// the order of the max and min function doesn't matter here
            }
        }
        int span = max - min;
        System.out.println(span);




    }
}
