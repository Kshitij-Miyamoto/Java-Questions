public class Method3 {
    static int eligiblity(int x){
        if (x > 18){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You aren't eligible");
        }
        return x;
    }
//Using if-else statement inside a method
    public static void main(String[] args) {
       eligiblity(24);
    }
}
