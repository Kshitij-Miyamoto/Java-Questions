import java.util.Scanner;

public class Recursion {
    public static int sum(int x){
        if ( x > 0 ) {
            return x + sum(x - 1);
        }
    else{
        return 0;
    }
}

    public static void main(String[] args) {
        int recursive = sum(10);
        System.out.println(recursive);
        System.out.println("Now to verify the answer using for loop: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int x = 0 ; x > a; a++ ){
            System.out.println(a);
        }
    }
}
