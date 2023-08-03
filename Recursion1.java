public class Recursion1 {
    public static int sum(int start, int end){
        //using recursion to print sum of numbers from 5 to 10
        if(end>start){
            return end + sum(start, end-1);
        }
        else{
            return 0;
        }
    }
//With this recursive program we can actually find any number digit sums
    public static void main(String[] args) {
        int x = sum(5,10);
        System.out.println(x);
    }
}
