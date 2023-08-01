import java.util.Scanner;

public class Methods {
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :  ");
        int a = in.nextInt();
        System.out.println("Enter second number :  ");
        int b = in.nextInt();
        int sum = a + b ;
        System.out.println("The sum of the numbers is: "+ sum);

        }

    }
    public static void main(String[] args) {
        sum();




    }
}
