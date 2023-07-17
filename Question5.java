import java.util.Scanner;
// Printing the nth number of fibonacci series
public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
         while(count <= n){
             int temp = b;// we create a temp
             b = b + a;
             a = temp;
             count ++;
         }
        System.out.println(b);
    }
}
