public class CheckAge {
    static void age(int x) {
        if (x > 18) {
            System.out.println("You are an adult proceed to login");
        } else {
            System.out.println("Invalid Age");
        }
    }
//In this method we use if and else statement in the function statement
    public static void main(String[] args) {
       int ageValue = 17;//Declared a new variable with the name ageValue and type integer.
       age(ageValue);
    }


}
