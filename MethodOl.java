public class MethodOl {
    static int sum(int x , int y){
        return x + y;
    }
    static float sum(float x , float y){
        return x + y;
    }
//Here we have made use of method overloading rather than writing 2 methods we made a method and gave it 2 datatypes.
    public static void main(String[] args) {
       int z = sum(13,12);
       float z1 = sum(12.5F,13.2F);//Here it is compulsory ti write "F" in order to write x and y.
        System.out.println(z);
        System.out.println(z1);
    }
}
