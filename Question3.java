import java.util.Scanner;
//Usage of while loop.
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = 0;
        while (i<=a)
        {
            System.out.println(i);
            i++;
        }
    }
}
