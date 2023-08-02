

public class MethodDemo {
    static String greet(String input) {
        return "Hello " + input + ", Intern at palantir London";
    }
        static int greet(int input1) {
            return  input1 ;
    }
//So we were doing a rookie mistake we didn't write the name of the parameter, so here we have written input
    public static void main(String[] args) {
        String z = greet("Kshitij Sharma");
        System.out.println(z);

        int x = greet(21);
        System.out.print("The age of the intern is : ");
            System.out.println(x);//here we just did a small manuplation where we just removed ln
    }
}

