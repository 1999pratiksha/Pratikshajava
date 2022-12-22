import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTrycatch {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the denominator");
        int num=Integer.parseInt(br.readLine());
        int[] c={1,2,3,4,5};
        try {
            int quotient = 100 / num;
            System.out.println(quotient);
            System.out.println(c[4]);

        }catch(ArithmeticException e){
            System.out.println("Error because of" +e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error because of" +e);
        }
    }
}
