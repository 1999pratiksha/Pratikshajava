import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class intialisingoperator {
    public static void main(String[] args) throws IOException {
        int i=7;
        int j=8;
        int k=6;
        System.out.println(i<j);
        System.out.println(++k);
        System.out.println(i<j && i>k);
        System.out.println(i>j || i>k);
        int a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of a:");
        a=Integer.parseInt(br.readLine());
        System.out.println(a);
        System.out.println("Enter the value of b:");
        b=Integer.parseInt(br.readLine());
        System.out.println(b);
        if(a>b){
            System.out.println("A is greater than B");
        }else {
            System.out.println("B is greater than A");
        }
    }
}
