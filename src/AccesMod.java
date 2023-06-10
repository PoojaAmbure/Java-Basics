import java.util.*;
class MyEmployee{
     private int id;
     private String name;

    public String getName(){
        return name;
    }
     public void setName(String n){
         name =n;
     }
     public int getId(){
         return id;
     }
    public void setId(int i){
        id = i;
    }
}
public class AccesMod {

    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        //emp.id= 1111;
        //emp.name="Pooja";
        emp.setName("PoojaAmbure");
        System.out.println(emp.getName());
        emp.setId(1111);
        System.out.println(emp.getId());

    }
}
