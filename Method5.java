public class Method5 {
    static int sum(int x, int y) {
        return x + y;
    }
//This is an example of Method Overloading, we can pass different parameters with same method-Name
    static float sum(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.print("The Integral sum is: ");
        System.out.println(sum(12,14));
        System.out.print("The Decimal sum is: ");
        System.out.println(sum(13.5F,12.2F));
    }
}
