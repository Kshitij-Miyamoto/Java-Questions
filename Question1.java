import java.util.Scanner;
//
public class Question1 {
    public static void main(String[] args) {
        //print numbers from a number
        System.out.println("Enter a number which needs to be printed : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        // Now using for loop
        for(int i = 1 ; i<=a ; i++)
        {
            System.out.println(i);
        }


    }
}
