import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //reverse of a number
        System.out.print("Enter a number to be reversed : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;

        while(num>0){
            int rem = num%10;
            ans = ans * 10 + rem;
            num = num/10;//this was basically the missing step
        }
        System.out.println(ans);
    }
}
