public class Multipleparameters {
    static void Info(String name , int age){//Here we put in 2 different type of parameters.
        System.out.println("The name is " + name );
        System.out.println("The age is " + age);
    }
//this is an example of multiple parameters in java.
    public static void main(String[] args) {
        System.out.println("The Details of the candidates are: ");
        Info("kshitij Sharma", 20);

        Info("Shouray", 16);

        Info("sourav Joshi",25);
    }

}
