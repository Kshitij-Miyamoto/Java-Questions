import java.util.Scanner;

public class Question2 {
    //Print odd numbers from 1 to n if the input is odd and print even numbers if the input is even
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 != 0) {
            System.out.println("The odd numbers till the number \n" + n + "\nare :");
            for (int i = 1; i < n; i = i + 2) {
                System.out.println(i);
            }
        }
        if (n % 2 == 0) {
            System.out.println("The evem numbers till the number \n" + n + "\nare :");
            for (int i = 0; i < n; i = i + 2) {
                System.out.println(i);
            }
        }
    }}

