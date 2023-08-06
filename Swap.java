public class Swap {
    public static void
    swap(int a , int b){
         int temp = a ;
         temp =  b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
//here the values didn't get swap.
    public static void main(String[] args) {
        swap(10,20);
    }
}
