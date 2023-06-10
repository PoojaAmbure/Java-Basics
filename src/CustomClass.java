import java.util.*;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("Id is=" + id);
        System.out.println("Name is=" + name);
    }
}

public class CustomClass {

    public static void main(String[] args) {
        System.out.println("This is a custom class");

        Employee emp = new Employee();
        Employee emp1 = new Employee();
        emp.id = 1;
        emp.name="PoojaAmbure";
        emp1.id = 15;
        emp1.name="PranayAmbure";
        //System.out.println(emp.id);
       // System.out.println(emp.name);

        emp.printDetails();
        emp1.printDetails();
    }
}
