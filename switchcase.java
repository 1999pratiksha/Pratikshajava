import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcase {
    public static void main(String[] args) throws IOException {
        int num;
        System.out.println("Enter numbers:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        num=Integer.parseInt(br.readLine());
        switch (num) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("invalid data");
        }
    }
}
