import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.println("Enter the number of terms in the series: ");
        int n = in.nextInt();
        System.out.println("The fibonacci Series is:");
       for(int i = 0; i < n ; i++){
           int nextnum = num1 + num2;
           num1 = num2;
           num2 = nextnum;
           System.out.println(nextnum);
        }

    }
}
