public class calculation {
    public static int cal(int x,int y,int z) {
        int sum=x+y+z;
        return sum;

    }
    public static float cal(float a,float b) {
        float sub=a-b;
        return sub;

    }
    public static int cal(int a,int b,int c,int d) {
        int mul=a*b*c*d;
        return mul;
    }
    public static String cal(String str) {
        String st2=str.toUpperCase();
        return st2;
    }

    public static void main(String[] args) {

        System.out.println( cal(10,5,2));
        System.out.println(cal(10,5));
        System.out.println(cal(2,4,3,5));
        System.out.println(cal("pratiksha"));
    }
}
