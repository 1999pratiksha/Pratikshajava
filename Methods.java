public class Methods {
    class abc{
        int z;
        static int add(int a,int b){
            int z=a+b;
            return (z);
        }
        static int sub(int a,int b){
            int z=a-b;
            return (z);
        }
        static int multiply(int a,int b){
            int z=a*b;
            return (z);
        }
        static int div(int a,int b){
            int z=a/b;
            return (z);
        }
        static int mod(int a,int b){
            int z=a%b;
            return (z);
        }
    }

    public static void main(String[] args) {
        int d=abc.add(7,5);
        int e=abc.sub(6,3);
        int f=abc.multiply(5,2);
        int g=abc.div(10,5);
        int h=abc.mod(10,2);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }
}
