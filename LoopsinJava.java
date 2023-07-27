import java.util.Scanner;
//revising loops on Java
public class LoopsinJava {
    public static void main(String[] args) {
        System.out.println("enter a number for iteration : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num < 10) {
            for (int i = 0; i <= num; i++) {
                System.out.println("Kshitij Apna Bhai hai " + i);
            }
        }
             else{
                int x = 0;
                while(x<=num)
                    x++;
                System.out.println(x);
            }
        }
    }

