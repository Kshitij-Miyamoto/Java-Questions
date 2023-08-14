import java.util.Scanner;

public class DecimalToAny {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a decimal number: ");
            int num1 = in.nextInt();
            System.out.println("Enter a base: ");
            int base = in.nextInt();
            int place = 1;
            int result = 0;


            while(num1 != 0){
                int dig = num1%base;
                num1 = num1/base;
                result = result + dig*place;
                place = place*10;
            }
            System.out.println("The corresponding number for the typed base is: ");
            System.out.println(result);

        }
    }

