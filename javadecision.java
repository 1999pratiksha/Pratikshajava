import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javadecision {
    public static void main(String[] args) throws IOException {
        int i,j,k,l,m;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 5 numbers:");
        i=Integer.parseInt(br.readLine());
        j=Integer.parseInt(br.readLine());
        k=Integer.parseInt(br.readLine());
        l=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());
        double avg=(i+j+k+l+m)/5;
        System.out.println("Average Marks is:" +avg);
        if(avg>=90){
            System.out.println("You will get a Smartwatch");
        } else if(avg>=70 && avg<90) {
            System.out.println("You will get Choclates");
        }else
        {
            System.out.println("you have to study hard");
        }

    }
}
