class  cha{ //custum class   // a-z A-Z SushantNandy
    int id_num; String phone;String name; String regex1="^[a-zA-Z]+$";String regex2= "^(\\+91)?[6-9][0-9]{9}";   // A.....Zand a....z    a==3;
    public void set1(int id1, String name1){
        this.id_num=id1;
        if (name1.matches(regex1)){
            this.name=name1;
        }else {
            System.out.println("wrong name set");
        }
    }
    public void set2(String p){
        if(p.matches(regex2)){
            this.phone=p;
        }else{
            System.out.println("wrong phone number");
        }
    }
    public int getId_num(){

        return id_num;
    }
    public String get_my_Name(){

        return name;
    }
    public String getPhone(){
        return phone;
    }
}
public class retrex {
    public static void main(String[] args) {
        cha c=new cha();
        c.set1(123,"pratiksha");
        System.out.println("name: "+c.get_my_Name());
        c.set2("+916360476957");
        System.out.println("Phone "+c.getPhone());
        System.out.println("ID" +c.getId_num());
    }
}










