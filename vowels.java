import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class vowels {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter aString:");
        str= br.readLine();
        str=str.toLowerCase();
        int c=0;
        for(int i=0;i< str.length();i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){

            c++;
        }
        }
        System.out.println("Total no of vowels in strings are:"+c);
    }
}
