import java.util.Scanner;
//Basically taking the input of a 2-D matrix in terms of rows and columns
public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//int n = in.nextInt();
        System.out.println("Enter the numeber of row: ");
        int r = in.nextInt();
        System.out.println("Enter the numeber of columns: ");
        int c = in.nextInt();

        int [][] arr = new int[r][c];
        System.out.println("The length of the array is: ");
        System.out.println(arr.length);
     for(int row = 0; row<arr.length ; row++){
         for(int col = 0 ; col<arr[row].length ; col++){
             arr[row][col] = in.nextInt();

         }
     }
        for(int row = 0; row<arr.length ; row++){
            for(int col = 0 ; col<arr[row].length ; col++){
                System.out.print(arr[row][col]+ " ");
    }
            System.out.println();
}
    }
}