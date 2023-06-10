import java.util.*;

class Employee1{
    int sal;
    String name;
    public int getSalary(){
        return sal;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name= n;
    }
}
public class PracSet5 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.sal= 95000;
        emp.name = "Pooja";
        emp.getSalary();
        System.out.println("Salary is= " + emp.sal);
        emp.getName();
        System.out.println("Name is= " + emp.name);

        emp.setName("Akshada");
        System.out.println("New name is=" + emp.name);
    }
}
