import java.io.BufferedReader;

public class radius {

    public static void add (int x,int y) {
        int add=x+y;
        System.out.println(add);

    }
    public static void sub (int x,int y) {
        int sub=x-y;
        System.out.println(sub);

    }
    public static void Mul (int x,int y) {
        int Mul=x*y;
        System.out.println(Mul);

    }
    public static void div (int x,int y) {
        int div=x/y;
        System.out.println(div);

    }

    public static void main(String[] args) {
       add(10,5);
    sub(20,10);
    Mul(10,4);
 div(8,2);
   }
}