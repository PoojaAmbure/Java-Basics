import java.util.*;

class MyEmployee2{
    private int id;
    private String name;

    public MyEmployee2(){
        id= 1111;
        name=" Pooooooooo";
    }
    public MyEmployee2(String Myname, int Myid){
        name = Myname;
        id = Myid;
    }

    public String getName(){ return name; }
    public void setName(String n){ name =n; }
    public int getId(){ return id; }
    public void setId(int i){ id = i; }
}

public class Constructor {
    public static void main(String[] args) {
       // MyEmployee2 emp = new MyEmployee2();
       MyEmployee2 emp = new MyEmployee2("Akshada" ,1);

        System.out.println(emp.getName());
        System.out.println(emp.getId());
    }
}