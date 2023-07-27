import java.util.Scanner;
//trying to get comfortable with Switch cases
public class Switchcases {
    public static void main(String[] args) {
        System.out.println("Enter a fruit name : ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
//enhanced switch statement, with inbuilt break statement.
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("My favourite");
            case "Papaya" -> System.out.println("Good for digestion");
            default -> System.out.println("Invalid input");
        }
    }
}
