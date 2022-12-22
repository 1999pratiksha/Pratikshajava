import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vararag {

    public int prod(int a,int ...arr){
        int product=1;
        System.out.println("Number of arguments: " + arr.length);
        for (int i=0;i<arr.length;i++){
            product=product*arr[i];
            System.out.println(arr[i] +" ");


        }
        return product;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        vararag v= new vararag();
        int y=v.prod(5,5,6,7,8);
        System.out.println(y);
    }
}
