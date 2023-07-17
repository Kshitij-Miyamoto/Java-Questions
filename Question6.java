import java.util.Scanner;
//To check the number of occurence in a number, whilst taking input form the user
public class Question6 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("Enter a number for checking: ");
        int n = in.nextInt();
        int count = 0;
        while (a > 0) {
            int rem = a % 10;
            if (rem == n) {
                count++;
            }
            a = a/10;
        }
        System.out.println(count);
    }
}
