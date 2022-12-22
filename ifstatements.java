import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifstatements {
    public static void main(String[] args) throws IOException {
        float time;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the time format:");
        time=Float.parseFloat(br.readLine());
        if(time<10){
            System.out.println("Good Morning");
        } else if (time<17) {
            System.out.println("Good Day");
        }else {
            System.out.println("Good Evening");
        }
    }
}
