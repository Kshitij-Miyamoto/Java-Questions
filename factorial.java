import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = 1;
        //the crucial point here was to just to get the condition right.
        for(int i = 1 ; i <= n ; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
