import java.util.Scanner;
//Uppercase and Lowercase problems
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner in = new Scanner(System.in);
        char c = in.next().trim().charAt(0);//this will print the first character of the string when entered.
        if( c >= 'a' && c <= 'z'){
            System.out.println("The letter is lowercase");
        }
        else{
            System.out.println("The letter is uppercase");
        }
    }
}
