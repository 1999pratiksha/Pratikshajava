class dem{

    public  int cal_add(int x, int y){
        int sum=0;
        return x+y;
    }
}


class dem1 extends dem{     // parent class

    public int cal_sub(int x,int y){
        return x-y;

    }
}
public class Superclass {

    public static void main(String[] args) {
        cal1 c = new cal1();
        //c.cal_sub(2, 5);
    }
}