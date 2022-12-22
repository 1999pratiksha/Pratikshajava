import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
       ArrayList<Integer> arr=new ArrayList<Integer>();
       arr.add(10);arr.add(15);arr.add(20);arr.add(134);
        System.out.println(arr.size());
        System.out.println(arr.get(2));
        System.out.println(arr.isEmpty());//Checks the boolean values
        arr.remove(3);
        System.out.println(arr.get(2));

        ArrayList<String> a1= new ArrayList<String>();
        a1.add("Pratiksha");a1.add("Naik");a1.add("karwar");
        System.out.println(a1);
        System.out.println(a1.size());
        System.out.println(a1.get(2));
        a1.add(1,"bandekar");
        System.out.println(a1);
        System.out.println(a1.get(1));
        a1.remove(2);
        System.out.println(a1);
    }
}
