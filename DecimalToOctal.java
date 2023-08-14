import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int num1 = in.nextInt();
        int place = 1;
        int result = 0;

        while(num1 != 0){
            int dig = num1%8;
            num1 = num1/8;
            result = result + dig*place;
            place = place*10;
        }
        System.out.println(result);

    }
}
