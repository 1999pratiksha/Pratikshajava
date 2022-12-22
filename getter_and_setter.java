import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class c1{
    double area;

    public void setArea(int r) {

        this.area = 3.142*r*r;
    }

    public double getArea() {

        return area;
    }
}
public class getter_and_setter {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number:");
        int i=Integer.parseInt(br.readLine());
        c1 c=new c1();
        c.setArea(i);
        System.out.println(c.getArea());
    }

}
