public class Stringoperations {
    public static void main(String[] args){
        String str="pratiksha";
        String str2="naik";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str2);
        System.out.println(str2.replace(str2,str));
        System.out.println(str.charAt(4));
        String str3="PRATI K";
        String str4="prati k";
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}
